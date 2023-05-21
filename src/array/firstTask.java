package array;
//Сумма и произведение элементов одномерного массива
public class firstTask {
    public static void main(String[] args) {
        int [] array = {1,1,1};
        int sum = 0;
        int multiply = 1;
        for (int num : array){
            sum = sum + num;
        }
        System.out.println("Сумма элементов = " + sum);

        for (int num : array){
            multiply = multiply * num;
        }
        System.out.println("Произведение элементов = " + multiply);
    }
}
