import java.util.Scanner;

public class Task2_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pleas input your number: ");
        int number = scn.nextInt();
        int oppositeNumber = - number;
        System.out.println("Your number is: " + number);
        System.out.println("Opposite number of yours is: " + oppositeNumber);
    }
}
