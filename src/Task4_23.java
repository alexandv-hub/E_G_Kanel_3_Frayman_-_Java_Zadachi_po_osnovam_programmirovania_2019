import java.util.Scanner;

public class Task4_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number ");
        int number = scanner.nextInt();
        System.out.println("Your number is: "+ number);
        int a = number/1000;
        int b = number%1000/100;
        int c = number%100/10;
        int d = number%10;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
        int changedNumber = d*1000+(a)*100+(b)*10+c;
        System.out.println(changedNumber);
    }
}
