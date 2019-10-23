import java.util.Scanner;

public class Task6_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Pleas, input second number: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber>0 && secondNumber>0){
            System.out.println("Numbers have same sign");
        }else if(firstNumber<0 || secondNumber<0){
            System.out.println("Numbers have different signs");
        }else if(firstNumber==0 || secondNumber==0){
            System.out.println("Incorrectly");
        }
    }
}
