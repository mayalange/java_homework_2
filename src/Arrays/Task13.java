package Arrays;
//Количества отрицательных и положительных элементов в массиве
public class Task13 {
    public static void main(String[] args) {
        int[] array = {1,3,-9,8,-1};
        int pol = 0;
        int otr = 0;

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }

        for (int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                pol = pol + 1;
            }
        }
        System.out.println("\nположительных элементов = " + pol);

        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                otr = otr + 1;
            }
        }
        System.out.println("отрицательных элементов = " + otr);
    }
}
