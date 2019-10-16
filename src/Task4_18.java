import java.util.Scanner;

public class Task4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scanner.nextInt();
        int a = number/100;
        int b = number%100/10;
        int c = number%10;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        String changedNumber = (a+1)+""+(b+1)+""+(c-c);
        System.out.println(changedNumber);

    }
}
