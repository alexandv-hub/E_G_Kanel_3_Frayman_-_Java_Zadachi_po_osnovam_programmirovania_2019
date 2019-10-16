import java.util.Scanner;

public class Task4_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scanner.nextInt();
        System.out.println("Your number equals " + number);
        int a = number/100;
        int b = number%100/10;
        int c = number%10;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        int changedNumber = c*100+a*10+b;
        System.out.println(changedNumber);
    }
}
