

public class Book {                  //attributes
    private String title;
    private float price;
    private String ISBN;
    private int numOfPages;


    public Book(){                 //no Argument Constructor
        this.title="unknow";
        this.price=0;
        this.ISBN="unknow";
        this.numOfPages=0;
    }

    public Book(String title,float price,String ISBN, int numOfpages){  //multiple argument constructor
        this.title=title;
        this.price=price;
        this.ISBN=ISBN;
        this.numOfPages=numOfpages;
    }
    public String getTitle(){       // Accessor
        return title;
    }
    public String getISBN(){       // Accessor
        return ISBN;
    }
    public float getPrice(){       // Accessor
        return price;
    }
    public int getNumOfPages(){       // Accessor
        return numOfPages;
    }

    public void setTitle(String title){  //mutator
        this.title=title;
    }
    public void setISBN(String ISBN){  //mutator
        this.ISBN=ISBN;
    }
    public void setPrice(float price){  //mutator
        this.price=price;
    }
    public void setNumOfpages(int setNumOfpages){  //mutator
        this.numOfPages=setNumOfpages;
    }

    public String toString() {

        return ("Title: " + getTitle() +
                "\nPrice: " + getPrice() +
                "\nISBN: " + getISBN() +
                "\nPages: " + getNumOfPages());
    }
}
