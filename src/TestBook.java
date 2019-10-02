public class TestBook {
    public static void main(String[]args){   //Driver class
        Book Legends = new Book();
        Legends.setTitle("Day of my life");
        Legends.setISBN("0.1100");
        Legends.setNumOfpages(200);
        Legends.setPrice(400);

        System.out.println(Legends.toString());
    }
}
