//Найти среднее число из трех
public class SecondTask {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 15;
        int number3 = 40;

        if (number1 == number2 || number1 == number3 || number2 == number3){
            System.out.println("ERROR");
        } else if (number1 > number2 && number1 < number3 || number1 < number2 && number1 > number3) {
            System.out.println("Среднее значение " + number1);
        } else if (number2 > number1 && number2 < number3 || number2 < number1 && number2 > number3){
            System.out.println("Среднее значение " + number2);
        } else if (number3 < number1 && number3 > number2 || number3 > number1 && number3 < number2) {
            System.out.println("Среднее значение " + number3);
        }
    }
}
