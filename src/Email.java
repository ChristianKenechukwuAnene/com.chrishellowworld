public class Email {       //attributes
    private String recipient;
    private String sender;
    private String text;


    public  Email(){      // no Argument constructor
        this.recipient="unknow";
        this.sender="uknow";
    }

    public Email(String recipient,String sender,String text){  // multiple Argument
        this.recipient=recipient;
        this.sender=sender;
        this.text=text;
    }

    public String getRecipient(){return recipient;}  //Accessor
    public String getSender(){return sender;}


    public void setRecipient(String recipient){this.recipient=recipient;}  //mutator
    public void setSender(String sender){this.sender=sender;}

    public void append(String text){this.text +=" "+text;}

    public String toString(){

        return ("recipient" + getRecipient()+
                "\nsender" + getSender());
    }
}
