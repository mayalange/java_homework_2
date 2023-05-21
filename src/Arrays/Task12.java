package Arrays;
//Найти количество положительных элементов массива
public class Task12 {
    public static void main(String[] args) {
        int[] array = new int[6];
        int count = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 45);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                count = count + 1;
            }
        }
        System.out.println("\ncount = " + count);
    }
}
