import java.util.Scanner;

public class Task5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if((a<b)||(a<100)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }
}
