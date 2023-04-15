//Проверка кратности числа
public class FourthTask {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 15;
        if( number1 % number2 == 0){
            System.out.println("Первое число равно " + number1   + "\nВторое число равно " + number2);
            System.out.println(number1 + " кратно " + number2);
        } else {
            System.out.println("Первое число равно " + number1 + "\nВторое число равно " + number2);
            System.out.println("Первое число не кратно второму ");
            System.out.println("Остаток от деления " + number1 % number2);
        }

    }
}
