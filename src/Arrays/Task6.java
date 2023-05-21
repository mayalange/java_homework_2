package Arrays;

import static java.lang.Math.abs;

//Максимальный по модулю элемент массива
public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++){
            if (abs(array[i]) > abs(max)){
                max = array[i];
            }
        }
        System.out.println("Максимальный по модулю элемент массива = " + max);
    }
}
