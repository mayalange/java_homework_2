package Arrays;
//Первый положительный элемент массива
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                System.out.println(array[i]);
                break;
            }
        }
    }
}
