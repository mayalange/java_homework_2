package Arrays;
//Сортировка методом пузырька
public class Task24 {
    public static void main(String[] args) {
        int[] array = {34,25,19,124,17};
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i+1]){ //34 > 25

                temp = array[i+1]; //temp = 25
                array[i] = array[i+1]; //34 = 25
                array[i] = temp;



            }
        }
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ",");
        }
    }
}
