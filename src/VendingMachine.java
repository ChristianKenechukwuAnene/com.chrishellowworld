public class VendingMachine { //attributes
    private int can;
    private int token;

    public VendingMachine(){ //No argument constructor
        this .can = 0;
        this.token= 0;
    }
    public VendingMachine(int can,int token){ //Multiple argument Constructor
        this.can = can;
        this.token =token;
    }
    public int getCan(){  //Accesso
        return can;

    }
    public int getToken(){
        return token;
    }

    public void setCan(int can){
        this.can=can;
    }
    public void setToken(int token){
        this.token=token;
    }
    public String toString(){
        return "Can"+getCan()+
                "\nToken"+ getToken();
    }
    public void buyCan(){
        setCan(getCan()-1);
        setToken(getToken()+1);
    }


}
