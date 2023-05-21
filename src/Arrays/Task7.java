package Arrays;
//Найти два максимальных элемента массива
public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[6];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 67);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > max1){
                max1 = array[i];
            }
        }
        System.out.println("\nmax1 = " + max1);

        for (int i = 0; i < array.length; i++){
            if (array[i] > max2 && array[i] != max1){
                max2 = array[i];
            }
        }
        System.out.println("max2 = " + max2);
    }
}
