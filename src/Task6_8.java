import java.util.Scanner;

public class Task6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number one: ");
        int number1 = scanner.nextInt();
        System.out.println("Pleas, input your number two: ");
        int number2 = scanner.nextInt();
        if(number1>number2){
            int sum = number1 + number2;
            System.out.println("Amount number one and two equals  " + sum);
        }else if(number1<number2){
            int multiply = number1 * number2;
            System.out.println("Composition number one and two equals " + multiply);

        }else{
            System.out.println("Numbers is equal");
        }
    }
}
