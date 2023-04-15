//Найти максимальное число из трех
public class FirstTask {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int number3 = 20;

        if(number1 > number2 && number1 > number3){
            System.out.println("max number " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("max number " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("max number " + number3);
        }
    }
}
