package TaskFor;
//Вывести таблицу умножения
public class Task6 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                result = i * j;
                System.out.print(result + " ");
            }
            System.out.print("\n");
        }
    }
}
