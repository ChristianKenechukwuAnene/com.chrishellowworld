
import javax.swing.*;
public class Q4 {
    public static void main(String[]args)
    {
        //string class where the user will enter number
        String num ="";

        //integer number to be enter
        int count = 0;

        int  total=0;

        //print the input box

        num = JOptionPane.showInputDialog("enter a number - positive, negative, or zero");

        while(!num.equals("q"))
        {

            //looping

            float numAsNum = Float.parseFloat(num);

            total += numAsNum;

            count ++;

            num = JOptionPane.showInputDialog("enter a number - positive, negative, or zero");

        }
        //print message box

        JOptionPane.showMessageDialog(null,"Total of the numbers: " + total +
                        "\nInput count : " + count,
                "counting:", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

