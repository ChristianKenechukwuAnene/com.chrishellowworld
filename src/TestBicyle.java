import javax.swing.*;

public class TestBicyle {
    public static void main(String[] args) {
        String owner, name , valueAsString;
        int value;

        name = JOptionPane.showInputDialog("Please enter your name");
        owner = JOptionPane.showInputDialog("Please enter the name of he owner");
        valueAsString = JOptionPane.showInputDialog("Please enter the value of the Bicyle");

        value=Integer.parseInt(valueAsString);

        Bicyle B1 = new Bicyle(name, owner,value);

        name = JOptionPane.showInputDialog("Please enter your name");
        owner = JOptionPane.showInputDialog("Please enter the name of he owner");
        valueAsString = JOptionPane.showInputDialog("Please enter the value of the Bicyle");

        value=Integer.parseInt(valueAsString);

        Bicyle B2 = new Bicyle();

        B2.setOwner(owner);

        B2.setName(name);

        B2.setValue(value);

        B1.setValue(B1.getValue()+10);

        System.out.println("Owner of Bicycle: " + B2.getOwner());

        System.out.println("Total Value of the two bicycles is: " + (B1.getValue () + B2.getValue ()));



        System.out.println(B1.toString());
        System.out.println(B2.toString());
    }
}