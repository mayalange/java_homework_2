package array;
//Сумма положительных элементов массива

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int sum = 0;
        System.out.println("Введите число:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int num : array) {
                if (num > 0) {
                    sum = sum + num;
                }
            }
            System.out.println(sum);

    }
}
