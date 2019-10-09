public class Animal {        //Attributes
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public Animal(){                             //no Argument Constroctor
        this("No Type Specified ",null,0.0,0);

    }
    public Animal(String type, String[] continents, double weight, int age){ // multiple Argument
        this.type=type;
        this.continents=continents;
        this.weight=weight;
        this.age=age;
    }
    public String getType(){return type;}//Accessor
    public String[] getContinents(){return continents;}
    public double getWeight(){return weight;}
    public int getAge(){return age;}


    public void setType(String type){this.type=type;}  //mutator
    public void setContinents(String[] continents) {this.continents=continents;}
    public void setWeight (double weight) {this.weight=weight;}
    public void setAge(int age){this.age=age;}


    public String toString(){
        String allConts="";

        if(continents!=null)
           for(int i=0;i<continents.length;i++)
               allConts+=continents[i];
           else
               allConts = "No continents specified";


        return ("type: " + getType()+
                "\ncontinents: " +allConts+
                "\nweight: " + getWeight()+
                "\nage: " + getAge());
    }
}
