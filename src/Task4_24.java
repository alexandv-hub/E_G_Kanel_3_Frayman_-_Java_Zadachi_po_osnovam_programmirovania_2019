import java.util.Scanner;

public class Task4_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Pleas, input second number: ");
        int secondNumber = scanner.nextInt();
        int lastDigitFirstNumber = firstNumber%10;
        int lastDigitSecondNumber = secondNumber%10;
        int changedFirstNumber = firstNumber - lastDigitFirstNumber + lastDigitSecondNumber;
        int changedSecondNumber = secondNumber - lastDigitSecondNumber + lastDigitFirstNumber;
        System.out.println(changedFirstNumber);
        System.out.println(changedSecondNumber);
    }
}
