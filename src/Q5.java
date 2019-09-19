
import javax.swing.*;

public class Q5 {
    public static void main(String []args)
    {
      float result;

      //print your input dialog box

      String choice = JOptionPane.showInputDialog(null, "A (for addition)" +
                                                  "\n S (for subtraction)" +
                                                   "\n M (for multiplication)" +
                                                   "\n D (for division)" +
                                                   "\n\n Operation desired:\n",
                                                    "Cal", JOptionPane.INFORMATION_MESSAGE);
      Float num = Float.parseFloat(JOptionPane.showInputDialog("enter a number ;\n"));

      Float num2 = Float.parseFloat(JOptionPane.showInputDialog("enter another number ; \n"));

      switch (choice)
      {
          case "A":
          result = num + num2;
          JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
          break;

          case "S":
              result = num - num2;
              JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
              break;

          case "D":
              result = num / num2;
              JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
              break;

          case "M":
              result = num * num2;
              JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
              break;


          default: JOptionPane.showMessageDialog(null,"Error");


      }
      System.exit(0);
    }
}
