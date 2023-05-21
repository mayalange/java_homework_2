package Arrays;
//Заменить элементы массива на противоположные
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] < 0 || array[i] > 0){
                array[i] = array[i] * -1;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }

    }
}
