import javax.swing.*;

public class Whileloop1 {
    public static void main(String[]args){

        String exchangeAsString = JOptionPane.showInputDialog("Please enter the current exchange rate:");

        double exchange = Double.parseDouble(exchangeAsString),naira = 400;

        while(naira!=0){

            String nairaAsString = JOptionPane.showInputDialog("Plase enter the amount of NARIA you want to convert in EURO:");

            naira = Double.parseDouble(nairaAsString);

            String result = String.format("%.2f",convert (naira,exchange));

            JOptionPane.showMessageDialog(null, nairaAsString + " converted is" +
                                                                         result + " euro", "Convert Result",
                                            JOptionPane.INFORMATION_MESSAGE);
        }

    }
    private static double convert(double naira, double exchange)
    {
        return naira*exchange;
    }
}
