package TaskFor;
//Вывод квадратов натуральных чисел

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предел: ");
        int N = scanner.nextInt();
        int natNum = 1;
        int result = natNum * natNum;
        while (result < N){
            System.out.println(result);
            natNum++;
            result = natNum * natNum;

        }


    }
}
