import java.util.Scanner;

public class Task6_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Pleas, input denominator: ");
        int denumerator = scanner.nextInt();
        if(numerator>denumerator){
            System.out.println("Fraction " +numerator+"/"+denumerator+ " is in law");
        }else{
            System.out.println("Fraction " +numerator+"/"+denumerator+ " is out law");
        }
    }
}
