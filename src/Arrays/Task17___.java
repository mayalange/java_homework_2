package Arrays;
//Самая длинная последовательность, состоящая из одинаковых элементов
public class Task17___ {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,0,1,0,1,1,1,1,1,0,0,0,1,0,1,0};
        int start_max = 1;
        int start_current = 1;
        int len_max = 1;
        int len_current = 1;


        for (int i = 0; i < array.length; i++){
            if (array[i] == array[i] + 1){
                len_current = len_current + 1;
            } else if (len_current > len_max) {
                len_max = len_current;
                start_max = start_current;

                
            }
            System.out.println("sart_max = " + start_max);
            System.out.println("len_max = " + len_max);
        }

    }
}
