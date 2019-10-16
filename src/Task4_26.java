import java.util.Scanner;

public class Task4_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Pleas, input your second number: ");
        int secondNumber = scanner.nextInt();
        int firstDigitFirstNumber = firstNumber/100;
        int firstDigitSecondNumber = secondNumber/100;
        int changedFirstNumber = (firstNumber - firstDigitFirstNumber*100) + firstDigitSecondNumber*100;
        int changedSecondNumber = (secondNumber - firstDigitSecondNumber*100) + firstDigitFirstNumber*100;
        System.out.println(changedFirstNumber);
        System.out.println(changedSecondNumber);
    }
}
