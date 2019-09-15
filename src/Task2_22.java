import java.util.Scanner;

public class Task2_22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas, input first number: ");
        int firstNumber = scn.nextInt();
        System.out.println("Pleas, input second number: ");
        int secondNumber = scn.nextInt();
        int sum = firstNumber + secondNumber;
        int composition = firstNumber * secondNumber;
        int diffrence = firstNumber - secondNumber;
        int diffrenceSecond = secondNumber - firstNumber;
        System.out.println("sum equils: " + sum);
        System.out.println("composition equils: " + composition);
        System.out.println("diffrence equils: " + diffrence);
        System.out.println("diffrence second equils: " + diffrenceSecond);
    }
}
