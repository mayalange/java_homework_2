package Arrays;
//Есть ли в массиве одинаковые элементы
public class Task18 {
    public static void main(String[] args) {
        int[] array = {1,3,4,4,8,8};

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    System.out.println("Одинаковый элемент: " + array[j]);
                }
            }
        }
    }
}
