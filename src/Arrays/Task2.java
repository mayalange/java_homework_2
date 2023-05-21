package Arrays;
//Сумма положительных элементов массива
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма положительных элементов массива = " + sum);
    }
}
