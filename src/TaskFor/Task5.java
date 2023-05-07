package TaskFor;
//Числа Фибоначчи
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        int result = 0;
        int temp = 0;
        for (int i = 3; i <= number; i++){
            result = first+second;
            System.out.println(result);
            temp = second;
            second = result;
            first = temp;
        }


    }
}
