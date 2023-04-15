import java.util.Scanner;

//Определение четверти на координатной плоскости
public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x");
        int x = scanner.nextInt();
        System.out.println("Введите значение y");
        int y = scanner.nextInt();
        if (x > 0 && y > 0){
            System.out.println("Четверть I");
        } else if (x < 0 && y > 0) {
            System.out.println("Четверть II");
        } else if (x < 0 && y < 0) {
            System.out.println("Четверть III");
        } else if (x > 0 && y < 0) {
            System.out.println("Четверть IV");
        } else {
            System.out.println("Точка лежит на оси");
        }
    }
}
