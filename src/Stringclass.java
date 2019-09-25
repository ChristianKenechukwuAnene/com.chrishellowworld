
import javax.swing.*;
import java.awt.*;

public class Stringclass {
    public static void main (String[]args){


        //set text area button
        JTextArea textArea = new JTextArea(10,10);
        Font textFont = new Font("monospaced",Font.PLAIN,15);
        textArea.setFont(textFont);

        float length;
        String name;

        name = JOptionPane.showInputDialog("Enter you Full Name:");

        int num = name.length();
        char initial = name.charAt(0);
        String cap = name.toUpperCase();
        int lastSpaceLocation = name.lastIndexOf(' ');
        String surname = name.substring(lastSpaceLocation,num);


        textArea.append("\nThe number of characters:" + num
                                        + "\nThe initial of the firatname:"+initial
                                       +"\nThe name entered in capital letters:"+cap
                                        +"\nThe surname:"+surname);

        JOptionPane.showMessageDialog(null,  textArea , "Distance", JOptionPane.INFORMATION_MESSAGE);


         System.exit(0);
    }
}
