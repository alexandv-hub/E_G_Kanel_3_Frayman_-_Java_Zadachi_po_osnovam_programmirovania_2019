import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4_12 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Task4_12");
        Scanner scanner = new Scanner(file);
        int number = scanner.nextInt();
        System.out.println(number);
        int a = number / 100;
        int b = number % 100 / 10;
        int c = number % 10;
        int sum = a*100 - c*b;
        System.out.println(sum);
    }
}
