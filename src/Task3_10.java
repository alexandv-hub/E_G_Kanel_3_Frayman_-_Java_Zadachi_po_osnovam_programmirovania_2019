import java.util.Scanner;

public class Task3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input sum money which Vasiliy have earned: ");
        double sumVasiliy = scanner.nextDouble();
        System.out.println("Pleas, input sum money which parents have gave to Vasiliy: ");
        double sumParents = scanner.nextDouble();
        System.out.println("Pleas, input course rub to euro: ");
        double course = scanner.nextDouble();
        double sumEuro = ((sumParents + sumVasiliy) / course);
        System.out.printf("Vasiliy has sum of money which equals %.1f euro", sumEuro);
    }
}
