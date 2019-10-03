import java.util.Scanner;

public class Task3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas input your integer number: ");
        int a = scanner.nextInt();
        System.out.println("Your number is " + a);
        for (int i = 1; i < 4 ; i++) {
            System.out.println(--a);
        }
    }
}
