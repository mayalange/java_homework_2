package Arrays;
//Поменять местами минимальный и максимальный элементы массива
public class Task11_have_question {
    public static void main(String[] args) {
        int[] array = new int[6];
        int max = 0;
        int avg = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 23);
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nmax = " + max);
//как найти индекс максимального значения ?
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + array[min]);

//        for (int i = 0; i < array.length; i++) {
//            avg = array[
//            max = array[min];
//            min = avg;
//
//            System.out.print(array[i] + ",");

        }

    }

