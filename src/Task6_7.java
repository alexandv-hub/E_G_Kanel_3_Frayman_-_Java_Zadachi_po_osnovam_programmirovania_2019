import javax.swing.*;

public class Task6_7 {
    public static void main(String[] args) {
     String number = JOptionPane.showInputDialog("Pleas, input your number ");
     JOptionPane.showMessageDialog(null, "Your number is " + number);
     int integerNumber = Integer.parseInt(number);
     if(integerNumber>=100){
         integerNumber++;
         JOptionPane.showMessageDialog(null, integerNumber);
     }else{
         JOptionPane.showMessageDialog(null, "Your number is <100 or <0");
     }
    }
}
