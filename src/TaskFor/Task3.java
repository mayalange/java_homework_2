package TaskFor;
//Вывести таблицу значений функции
public class Task3 {
    public static void main(String[] args) {

        double x = -5;
        double y = 0;

       while (x <= 5){
           y = 5 - x * x /2;
           System.out.println(x + ", " + y);
           x = x + 0.5;
       }
    }
}
