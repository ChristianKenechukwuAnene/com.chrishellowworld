
public class RugbyPlayer {

    private String name;
    private double weight;
    private boolean injured;
    private String position;


    public RugbyPlayer() {
        this.name = "Unknow";
        this.weight = 0.0;
        this.injured = false;
        this.position = "Unknow";
    }

    public RugbyPlayer(String name, double weight, boolean injured, String position) {
        this.name = name;
        this.weight = weight;
        this.injured = injured;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isInjured() {
        return injured = injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public String getPosition() {
        return position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String toString() {
        return "Name" + getName() +
                "\n weight" + getWeight() +
                "\n position" + getPosition() +
                "\ninjured" + isInjured();
    }
}