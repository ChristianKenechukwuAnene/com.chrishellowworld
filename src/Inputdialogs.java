import javax.swing.*;
import java.awt.*;

public class Inputdialogs {
    public static void main(String[]args){

        String name = JOptionPane.showInputDialog("Please enter your name:");

        String lengthAsString = JOptionPane.showInputDialog("Plaese enter the length of your room in meters:");

        String breadthAsString = JOptionPane.showInputDialog("Please enter the breadth of your room in metres:");

        String costAsString = JOptionPane.showInputDialog("Please enter the cost per square metre of yur carpet:");

        double length = Double.parseDouble(lengthAsString);

        double breadth = Double.parseDouble(breadthAsString);

        double cost = Double.parseDouble(costAsString);

        double area = length*breadth;

        String output = String.format("Quotation for %s" +
                                      "\n%-40s%.2f m." +
                                      "\n%-40s%.2f m." +
                                      "\n%-40s%.2f m." +
                        "\n%-40s%.2f euro " + "\n%-40s%.2f euro.", name,
                         "Length of room:",length,
                        "Breadth of room:",breadth,
                        "Total area of the room:",area,
                        "Cost per square metre of carpet:",cost,
                        "Total cost of carpet:", cost*area);

                JTextArea template = new JTextArea();

        template.append(output);

        Font font = new Font("courier",Font.PLAIN,15);

        template.setFont(font);

        JOptionPane.showMessageDialog(null,template);
    }
}









