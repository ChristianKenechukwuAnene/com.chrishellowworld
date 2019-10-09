import javax.swing.*;

public class TestEmail {
    public static void main(String [] args){   //driver


       Email brother = new Email("Jame O' Donoghue", "Colm Cooper", "can you com for visiting");

        String Email = JOptionPane.showInputDialog("Please enter the message you want to send:");

        brother.append(Email);

        System.out.println(brother.toString());
    }
}
