import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number in form nnn: ");
        int number = scanner.nextInt();
        int a = number / 100;
        int b = (number - a * 100)/10;
        int c = (number - a * 100)%10;
        System.out.println(a + " " + b + " " + c);


    }
}
