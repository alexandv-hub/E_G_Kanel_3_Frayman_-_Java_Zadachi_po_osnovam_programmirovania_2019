import java.util.Scanner;

public class Task2_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your name: ");
        String name = scanner.nextLine();
        System.out.println("Pleas, input your middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Pleas, input your last name: ");
        String lastName = scanner.nextLine();
        System.out.println(name.charAt(0) + "." + middleName.charAt(0) + "." + lastName);
    }
}
