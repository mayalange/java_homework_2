package Arrays;
//Сортировка выбором
public class Task23_have_question {
    public static void main(String[] args) {
        int[] array = {1,8,89,67,7};
        int max = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("max = " + max);

    }
}
