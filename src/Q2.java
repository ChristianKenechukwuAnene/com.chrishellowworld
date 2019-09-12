import javax.swing.*;
public class Q2 {
    public static void main(String[] args){

        String firstName = JOptionPane.showInputDialog("Plaese enter your first name:");

        String secondName = JOptionPane.showInputDialog("Please enter you second name:");

        String initials = JOptionPane.showInputDialog("Plase enter your initials:");

        String distanceAsString = JOptionPane.showInputDialog("Plase enter the distance you cycled(in KM:");

        double distance = Double.parseDouble(distanceAsString);

        double cost = sponsorCost(distance);

        JOptionPane.showMessageDialog(null, "First Name:" + firstName +
                                                                     "\nSecondName: " + secondName +
                                                                     "\nDistance Cycled: " + distance +
                                                                     "\nAmount owed: £" + String.format("%.2f",cost));
    }
    public static double sponsorCost(double x)
    {
        if(x<=10)
        {
            return x*0.07;
        }
        else
        {
            return (10*0.07)+((x-10)*0.1);
        }
    }
}
