import javax.swing.*;

public class Q6 {
    public static void main(String []args)
    {
        float result=0;

  String choice ="";



       while (choice !="Q")
        { choice = JOptionPane.showInputDialog(null, "A (for addition)" +
                        "\n S (for subtraction)" +
                        "\n M (for multiplication)" +
                        "\n D (for division)" +
                        "\n\n Operation desired:\n",
                "Cal", JOptionPane.INFORMATION_MESSAGE);
            Float num = Float.parseFloat(JOptionPane.showInputDialog("enter a number ;\n"));

            Float num2 = Float.parseFloat(JOptionPane.showInputDialog("enter another number ; \n"));


            if(choice == "A")
                result = num + num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);


            if(choice == "S")
                result = num - num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);


            if(choice == "D")
                result = num / num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);


             if(choice == "M")
                result = num * num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);





        }
        System.exit(0);
    }
}
