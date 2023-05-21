package Arrays;
//Найти разность между максимальным и минимальным элементами массива
public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[6];
        int max = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 189);
        }
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nmax = " + max);

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max - min =" + (max - min));


    }

}
