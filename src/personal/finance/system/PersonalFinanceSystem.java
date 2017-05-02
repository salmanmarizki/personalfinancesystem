/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.finance.system;
import java.util.*;
import java.io.*;
import static personal.finance.system.Changes.readFile;
import static personal.finance.system.Changes.sc;

/**
 *
 * @author salman
 */
public class PersonalFinanceSystem {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Login a = new Login();
        Changes c = new Changes();
        
        String filename = null;
        Scanner user = new Scanner(System.in);
        
        System.out.println("Welcome to the Personal Finance System.");
        int i;
        
        System.out.println("Are you new? (Y/N): ");
        String x = user.nextLine();
        if (x.equals("Y" )|| x.equals("y")){
        a.signUp();
        }
        else if (x.equals("N") || x.equals("n"))
            if(a.getDetails()){
                a.mainpage();
                boolean readFile = readFile(); //Call the method to read the file with the files name 
                if (readFile){
                   System.out.println("What would you like to do? ");
                    System.out.println("1) Update?");
                    System.out.println("2) New record?");
                    System.out.println("3) Log out. ");
                    int n = sc.nextInt();
                while ( n == 1 || n ==2 || n ==3)   { 
                    if (n==1){
                        Scanner input = new Scanner(System.in);

                        System.out.println("Please enter line number: ");
                        int lineNo = input.nextInt();
                        input.nextLine(); //Next scanner will be skipped without this.
                        System.out.println("Please enter the name: ");
                        String nm = input.nextLine();
                        System.out.println("Please enter the value: ");
                        String v = input.nextLine();

                        c.update(lineNo, nm, v);
                        
                    }
                    else if (n == 2){
                        c.newRecord();

                    }
                    else if (n==3){
                        System.out.println("You've successfully logged out.");
                        System.exit(0);
                        
                    }
                    else
                        System.out.println("You entered the wrong option.");
                        break;
                    
                }                    
                }
            }
            




    }
        
}
