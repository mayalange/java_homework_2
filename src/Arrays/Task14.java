package Arrays;
//Вывести элементы массива, которые больше среднего арифметического
public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[6];
        int avg = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 23);
        }
        int count = array.length;

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("\nsum = " + sum);

        for (int i = 0; i < array.length; i++){
            avg = sum / count;
        }
        System.out.println("avg = " + avg);

        for (int i = 0; i < array.length; i++){
            if (array[i] > avg){
                System.out.println("больше средне арифметического: " + array[i]);
            }
        }

    }
}
