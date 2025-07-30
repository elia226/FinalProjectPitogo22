package activity1;

import java.util.Scanner;


public class Activity2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        
               System.out.print("Enter employee name: ");
               String empnm = sc.nextLine();
               System.out.print("Enter hourly rate: ");
               float rate = sc.nextFloat();
               System.out.print("Enter total hourse worked this week: ");
               float hwrk = sc.nextFloat();
               
               float wage = (hwrk*rate);
               float SSS = (float) (wage*0.1);
               
                                       
               System.out.println("----Wage Summary----");
               System.out.println("Employee: "+empnm);
               System.out.println("Hourly Rate: "+rate); 
               System.out.println("Hours Worked: "+hwrk);
               System.out.println("Gross Weekly Wage: "+wage);
               System.out.println("SSS Contribution (10%): "+SSS);
               System.out.println("--------------------");
               System.out.println("Net Weekly Wage: "+(wage - SSS) );
               
               
               
        
    }
    
}
       
