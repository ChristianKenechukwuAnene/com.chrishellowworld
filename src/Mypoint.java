public class Mypoint {  //attributes
    private double xVal;
    private double yVal;


    public Mypoint(){  // no multiple argument
        this.xVal=0;
        this.yVal=0;
    }
    public Mypoint(double xVal,double yVal){  //multiple argument
        this.xVal=xVal;
        this.yVal=yVal;
    }

    public double getxVal(){ return xVal;}  //accessor
    public double getyVal(){ return yVal;}

    public void setxVal(double xVal){this.xVal=xVal;} //mutator
    public void setyVal(double yVal){this.yVal=yVal;}

    public void moveHorizontally(double x){ xVal += x; }  //call method
    public void moveVertically(double y){ yVal += y; }

    public double distanceFromOrigin(){
        return(Math.sqrt((Math.pow(this.xVal,2))+(Math.pow(this.yVal,2))));
    }

    public String toString(){
        return "xVal" + getxVal()+
                "\nyVal" + getyVal();
    }
}

