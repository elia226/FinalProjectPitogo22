package banking;


public class bankapp {
   
    int accNo = 100021;
    float balance;
    int pin = 1234;
   
   
   public boolean verifyAccount(int accn, int pn){
       if(accNo == accn && pin == pn){
           return true;
       }else{
           return false;
       }
   }
   
   public void deposit(){
       
   }
     
   public void withdraw(){
       
   }      

   
   
}
