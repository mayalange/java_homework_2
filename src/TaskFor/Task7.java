package TaskFor;
//Комбинации из трех чисел, дающие в сумме заданное число
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите предел трех чисел");
        int predel = scanner.nextInt();
        System.out.println("введите число сумму");
        int sum = scanner.nextInt();
        int result = 0;
       for (int i = 1; i <= predel; i++){
           for (int j = 1; j <= predel; j++){
               for (int k = 1; k <= predel; k++){
                   result = i + j + k;
                   if (result == sum){
                       System.out.println(i + "," + j + "," + k);
                   }
               }
           }
       }
    }
}
