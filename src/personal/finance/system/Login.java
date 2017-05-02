 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.finance.system;
import java.util.*;
import java.io.*;

/**
 *
 * @author salman
 */
class Login {
    
public Login(){
    
}
public void signUp(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your user name: ");
    String name = input.nextLine();
    System.out.println("Enter your password: ");
    String password = input.nextLine();
    
    try {
        BufferedWriter in = new BufferedWriter(new FileWriter("user.txt",true));
        in.newLine();
        in.write(name);
        in.write(",");
        in.write(password);
        in.close();
        
        System.out.println("Congrats "+ name+ "! You have registered your new account.");
    }
    
    catch (Exception e){
        System.out.println("File not found " + e.getMessage());
    }
}
    
public boolean getDetails ()throws Exception{
        
        ArrayList<String[]> login = new ArrayList<>();
       
        String logname = null;
        String logpass = null;
        
        boolean flag = false;
    
        File file = new File("user.txt");
        System.out.println("\t    - L O G I N -");
        System.out.println("--------------------------------");
        
       
        Scanner scan=new Scanner(file);  
        while (scan.hasNextLine()){
            String line = scan.nextLine();
            login.add(line.split(","));
        }
        
        
        Scanner user=new Scanner(System.in);
        System.out.print("Username: ");
        logname=user.nextLine();
        
        System.out.print("Password: "); 
        logpass=user.nextLine();
        
        System.out.println("--------------------------------");
        
        for(int i = 0; i < login.size(); i++){
                if(logname.equalsIgnoreCase(login.get(i)[0]) && logpass.equals(login.get(i)[1])){
                    System.out.println("\tWelcome "+ logname+" !");
                    return true;
                }
                else{
                    continue;
                }
                
        }
        System.out.println("User not found");
        
       scan.close();
       return false;
}
public void mainpage(){
    
     System.out.println("What would you like to do today? ");
            System.out.println("1) Income");
            System.out.println("2) Daily Expenses");
            System.out.println("3) Weekly Expenses");
            System.out.println("4) Monthly Expenses");
            System.out.println("5) Asset");
            System.out.println("6) Report");
            System.out.println("7) Log Out");
            
}
}

