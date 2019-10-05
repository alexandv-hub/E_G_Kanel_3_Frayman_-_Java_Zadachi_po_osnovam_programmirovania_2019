import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scanner.nextInt();
        int a = number / 100;
        int b = (number / 10)%10;
        int c = number % 10;
        System.out.println(a * 100 + "+" + b * 10 + "+" + c);
    }
}
