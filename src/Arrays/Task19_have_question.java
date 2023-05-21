package Arrays;
//Вставка элемента в массив
import java.util.Scanner;

public class Task19_have_question {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int id = 0;

        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length - 1; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ",");
        }
        System.out.println("Введите новый элемент");
        num = scanner.nextInt();
        //Все элементы до указанной позиции сдвигаем на один назад?


    }
}
