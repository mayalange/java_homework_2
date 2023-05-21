package Arrays;
//Сумма и произведение элементов одномерного массива
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int sum = 0;
        int multiply = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива = " + sum);

        for (int i = 0; i < array.length; i++) {
            multiply = multiply * array[i];
        }
        System.out.println("Произведение элементов массива = " + multiply);

    }
}
