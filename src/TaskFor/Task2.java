package TaskFor;
//Возведение числа в степень
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        double number = scanner.nextDouble();
        System.out.println("введите степень:");
        double degree = scanner.nextDouble();
        double result = 1;

        if (degree < 0) {
            for (int i = 0; i > degree; i--) {
                result = result / number;

            }
            System.out.println(result);

        }else if (degree == 0) {
            result = 1;
            System.out.println(result);
        } else {
            for (int i = 0; i < degree; i++) {
                result = number * result;
            }
            System.out.println(result);
        }
    }
}
