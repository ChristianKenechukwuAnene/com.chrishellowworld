public class Animal {        //Attributes
    private String type;
    private String continents;
    private double weight;
    private int age;

    public Animal(){                             //Arays
        Animal("No Type Specified ",null,0.0,0);

    }
    public Animal(){  // no Argument Constructor
        this.type="unknow";
        this.continents="unknow";
        this.weight="unknow";
        this.age="unknow";
    }
    public Animal(String type, String continents, double weight, int age){ // multiple Argument
        this.type=type;
        this.continents=type;
        this.weight=type;
        this.age=type;
    }
    public String getType(){return type;}//Accessor
    public String getContinents(){return continents;}
    public String getWeight(){return weight;}
    public String getAge(){return age;}
}
