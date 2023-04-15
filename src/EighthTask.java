import java.util.Scanner;

//Принадлежит ли точка кругу с центром в начале координат
public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Координата X точки: ");
        double x = scanner.nextDouble();
        System.out.println("Координата Y точки: ");
        double y = scanner.nextDouble();
        System.out.println("Радиус круга: ");
        double radius = scanner.nextDouble();
        double hypotenuse = Math.sqrt(x * x + y * y);
        if(hypotenuse <= radius){
            System.out.println("Точка принадлежит кругу");
        } else {
            System.out.println("Точка не принадлежит кругу");
        }
    }
}
