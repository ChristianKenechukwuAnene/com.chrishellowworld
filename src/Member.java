public class Member {
    private String name;
    private boolean paid;
    private static int numOfmem = 0;     //true encapsulation for attributes


    public Member() {                   // No argument Constructor
        this("unknow");


    }

    public Member(String name) {          //Single argument constructor
        setName(name);
        setPaid(false);
        numOfmem++;


    }

    public static int getNumOfmen()

    {     //Class method
        return numOfmem;


    }

    public void setName(String name) {    //mutator method
        this.name = name;
    }

    public String getName() {           //Accessor method
        return name;
    }

    public void setPaid(boolean paid) {    //mutator method
        this.paid = paid;
    }

    public boolean getPaid() {           //Accessor method
        return paid;
    }

    public String toString() {
        return String.format("Name:%s\n" +
                "paid:%s\n",
                getName(), getPaid());
    }
}



