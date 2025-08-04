package main;

import banking.bankapp;
import java.util.Scanner;


public class main {
    
       public static void main(String[] args) {
        Scanner system = new Scanner(System.in);
        bankapp bnk = new bankapp();
        int attemp = 3;
       
        System.out.println("WELCOME TO MY BANK SYSTEM!");
        System.out.println("What do you need for today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
       
        System.out.print("Enter your choice: ");
        int choice = system.nextInt();
       
             switch( choice ){
                case 1:
                    while( attemp != 0 ){
                        
                        System.out.print("Enter Account No : ");
                        int acc = system.nextInt();

                        System.out.print("Enter Pin No : ");
                        int pin = system.nextInt();

                            if (bnk.verifyAccount(acc, pin)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
                            else{
                                attemp--;
                                System.out.println("Invalid Account No or Pin! Left attemp " + attemp);
                                
                            }
                            
                            if ( attemp == 0 ){
                                System.out.println("Try Again later!");
                            }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
             }
    }
    
}