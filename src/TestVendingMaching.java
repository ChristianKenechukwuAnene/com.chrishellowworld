
public class TestVendingMaching {
    public static void main(String[] args) {
        VendingMachine ven = new VendingMachine(15,10);
        ven.buyCan();
        System.out.println(ven.toString());
    }
}
