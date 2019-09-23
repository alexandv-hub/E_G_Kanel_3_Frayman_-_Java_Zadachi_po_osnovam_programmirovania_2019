import java.util.Scanner;

public class Task2_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("What's your last name? ");
        String lastName = scanner.nextLine();
        System.out.println("You are named " + name + " " + lastName);
    }
}
