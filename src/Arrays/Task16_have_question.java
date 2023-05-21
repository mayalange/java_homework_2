package Arrays;
//Определить индексы элементов массива, значение которых лежит в указанном пределе
import java.util.Scanner;

public class Task16_have_question {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 56);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        // как найти индекс элементов массива
        System.out.println("Введите min");
        int min = scanner.nextInt();
        System.out.println("Введите max");
        int max = scanner.nextInt();



    }

}
