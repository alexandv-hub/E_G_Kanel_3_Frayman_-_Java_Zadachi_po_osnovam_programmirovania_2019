import java.util.Scanner;

public class Task6_5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scanner.nextInt();
        if(number==0){
            System.out.println("Your number equals null");
        }else{
            System.out.println("Your number don't equals null, it is " + number);
        }
    }
}
