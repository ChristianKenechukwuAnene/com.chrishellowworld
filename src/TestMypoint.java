import javax.swing.*;

public class TestMypoint {
    public static void main(String [] args)
    {
        Mypoint P = new Mypoint(4,2);

        System.out.println(P.toString());

        P.moveHorizontally(6);
        System.out.println(P.toString());

        P.moveVertically(6);
        System.out.println(P.toString());

    }
}
