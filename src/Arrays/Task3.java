package Arrays;
//Сумма элементов частей массива
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumLeft = 0;
        int sumRight = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Введите число k");
        int k = scanner.nextInt();

        for(int i = 0; i <= k; i++){
            sumLeft = sumLeft + array[i];
        }

        for (int i = k + 1; i < array.length; i++){
            sumRight = sumRight + array[i];
        }
        if(sumLeft > sumRight){
            System.out.println("sum1 > sum2");
        } else if (sumLeft < sumRight) {
            System.out.println("sum1 < sum2");
        } else {
            System.out.println("sum1 = sum2");
        }
    }
}
