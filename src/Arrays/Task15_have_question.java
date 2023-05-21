package Arrays;
//Элементы массива, которые больше предыдущего
public class Task15_have_question {
    public static void main(String[] args) {
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 67);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        //как сделать сравнение с предыдущим ?
        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i] - 1){
                System.out.println(array[i]);
            }
        }
    }
}
