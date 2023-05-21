package Arrays;
//Поиск максимального элемента в массиве
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент в массиве = " + max);

    }
}
