
package client.server.model;

import java.security.SecureRandom;
import javax.crypto.KeyGenerator;


public class PayDetails {
   
   private long cardnum;
   private int cvv;
   private int amount;
   private String key;
   private String fname;
   private String lname;
   private boolean keystate;
   
   public PayDetails(int cardnum,int cvv, int amount,String key){
       this.cardnum=cardnum;
       this.cvv=cvv;
       this.amount=amount;
       this.key=key;
   }
   
   public PayDetails(){
       this.amount=0;
       this.cardnum=0;
       this.cvv=0;
       this.key=null;
   }
   
   public void setCardNum(long cardnum){
       this.cardnum=cardnum;
   }
   public void setCvv(int cvv){
       this.cvv=cvv;
   }
   public void setAmount(int amount){
       this.amount=amount;
   }
   public void setKey(String key){
       this.key=key;
   }
   public void setFname(String fname){
       this.fname=fname;
   }
   public void setLname(String lname){
       this.lname=lname;
   }
   public void setKeystate(boolean keyst){
       this.keystate=keyst;
   }
   public void clrAll(){
       this.amount=0;
       this.cardnum=0;
       this.cvv=0;
       this.key=null;
   }
   
   public long getCardNum(){
       return (this.cardnum);
   }
   public int getCvv(){
       return (this.cvv);
   }
   public int getAmount(){
       return(this.amount);
   }
   public String getKey(){
       return (this.key);
   }
   public boolean getKeystate(){
       return keystate;
   }
   
   public void printAll(){
       System.out.println("Name is "+fname+lname);
       System.out.println("Amount is "+amount);
       System.out.println("Key is "+key);
       System.out.println("key state is "+keystate);
   }
   
   public void keyGen()throws Exception{
       KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        SecureRandom secRandom = new SecureRandom();
        keyGen.init(secRandom);
        java.security.Key key = keyGen.generateKey();
        String atkey = String.valueOf(key);
        String actkey = atkey.substring(30);
        this.key=actkey; 
   }
   
   //while(){}
}
