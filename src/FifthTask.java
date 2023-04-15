import static java.lang.Math.abs;

//Вычисление значения функции
public class FifthTask {
    public static void main(String[] args) {
        int x = -1;
        int y;
        System.out.println("Если x равно " + x);
        if (x > 0) {
            System.out.println("Тогда y равен " + (y = x - 2));
        } else if (x == 0) {
            System.out.println("Тогда y равен 0");
        } else {
            System.out.println("y равен |x| = " + abs(x));
        }
    }
}
