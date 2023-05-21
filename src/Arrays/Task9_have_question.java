package Arrays;
//Разделить элементы массива на максимальный
public class Task9_have_question {
    public static void main(String[] args) {
        int [] array = new int[6];
        int max = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 45);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nmax = " + max);

        for (int i = 0; i < array.length; i++){
            array[i] = array[i] / max;
        }
        //как сделать тип double?
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
    }
}
