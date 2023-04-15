import java.util.Scanner;
//Вычисление площадей геометрических фигур
public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - прямоугольник, 2 - треугольник, 3 - круг: ");
        int figure = scanner.nextInt();
        if (figure == 1){
            System.out.println("Введите длину первой стороны");
            double line1 = scanner.nextDouble();
            System.out.println("Введите длину второй стороны");
            double line2 = scanner.nextDouble();
            double s = line1 * line2;
            System.out.println("Площадь прямоугольника " + s);
        } else if (figure == 2) {
            System.out.println("Введите длину первой стороны");
            double line1 = scanner.nextDouble();
            System.out.println("Введите длину второй стороны");
            double line2 = scanner.nextDouble();
            System.out.println("Введите длину третьей стороны");
            double line3 = scanner.nextDouble();
            double s = 0.5 * (line1 + line2 + line3);
            double s2 = Math.sqrt( s * (s - line1) * (s - line2) * (s - line3));
            System.out.println("Площадь треугольника " + s2);
        } else if (figure == 3) {
            System.out.println("Введите диаметр круга");
            double diameter = scanner.nextDouble();
            double s = Math.PI * (diameter * diameter) / 4;
            System.out.println("Площадь круга " + s);
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
