public class TestRugbyPlayer {
    public static void main(String[] args) {
        RugbyPlayer John = new RugbyPlayer();
        John.setName("John");
        John.setInjured(true);
        John.setPosition("center");
        John.setWeight(75);


        System.out.println(John.toString());
    }
}
