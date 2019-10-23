import java.util.Scanner;

public class Task6_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas, input your number: ");
        int number = scanner.nextInt();
        int firstFigure = number/100;
        int middleFigure = number%100/10;
        int lastFigure = number%10;
        System.out.println(firstFigure);
        System.out.println(middleFigure);
        System.out.println(lastFigure);
        if(firstFigure%2==0&&middleFigure%2==0&&lastFigure%2==0){
            System.out.println("The number is even-beautiful");
        }

    }
}
