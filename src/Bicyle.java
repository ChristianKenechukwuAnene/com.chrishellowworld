public class Bicyle {  //attributes
    private String owner;
    private String name;
    private int value;

    public Bicyle(){  //no argument Constructor
       this.owner = "uknow";
       this.name = "uknow";
       this.value = 0;
    }
    public Bicyle (String owner, String name, int value){   //multiple argument constructor
        this.name=name;
        this.owner=owner;
        this.value=value;
    }
    public String getOwner(){return owner;}//Accessor
    public String getName(){return name;}
    public int getValue(){return value;}

    public void setOwner(String owner){this.owner=owner;} //mutator
    public void setName(String name){this.name=name;}
    public void setValue(int value){this.value=value;}

    public String toString (){
        return ("owner: " + getOwner ()+
                "\n name: " + getName ()+
                "\n value: " +getValue ());
    }

}
