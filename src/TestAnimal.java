import javax.swing.*;

public class TestAnimal {
    public static void main(String [] args){

        Animal a1 = new Animal();

        System.out.println(a1.toString());

        Animal a2 = new Animal("dog",new String[]{"Nigeria, Australia"},10,50);

                //Class.mutate("Class", new String[]{"Nigeria, Australia"} 10,50);

        System.out.println(a2.toString());
    }

}
