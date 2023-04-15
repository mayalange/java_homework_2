import java.util.Scanner;

//Определить возможность существования треугольника по сторонам
public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину первой стороны треугольника");
        int a = scanner.nextInt();
        System.out.println("введите длину второй стороны треугольника");
        int b = scanner.nextInt();
        System.out.println("введите длину третьей стороны треугольника");
        int c = scanner.nextInt();
        if(a < b + c && b < a + c && c < a + b){
            System.out.println("Треугольник существует");
        } else{
            System.out.println("Треугольник не существует");
        }
    }
}
