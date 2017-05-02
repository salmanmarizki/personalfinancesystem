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
class Changes {
    static StringBuffer stringBuffer = new StringBuffer();
    static String filename = null;
    static Scanner sc = new Scanner(System.in); 
    static ArrayList<String[]> array = null;

static boolean readFile(){
        System.out.println("Please enter your choice: ");
        int c = sc.nextInt();
        
            if (c == 1){
                filename = "income.txt";
            }
            
            else if (c == 2){
                filename = "daily expense.txt";
            }
            
            else if (c == 3){
               filename = "weekly expense.txt";
           }

            else if (c == 4){
                filename = "monthly expense.txt";
            }
            else if(c == 5){
                filename = "asset.txt";    
            }
            
            else if (c == 6){
                BufferedReader in = null;
                System.out.println("Which one of these you'd like to see?");
                System.out.println("1) Income");
                System.out.println("2) Daily Expenses");
                System.out.println("3) Daily Expenses");
                System.out.println("4) Daily Expenses");
                System.out.println("5) Asset");
                int i = sc.nextInt();
                if ( i == 1){
                    filename = "income.txt";
                }
                
                else if ( i == 2){
                    filename = "daily expense.txt";
                }
                
                else if ( i == 3){
                    filename = "weekly expense.txt";
                }
                
                else if ( i == 4){
                    filename = "monthly expense.txt";
                }
                
                else if ( i == 5){
                    filename = "asset.txt";
                }
                
                    try {
                        in = new BufferedReader (new FileReader (filename));
                        String line; 
                        while ((line = in.readLine()) !=null)
                        {
                            System.out.println(line);
                            stringBuffer.append(line).append("\r\n");
                        }
                        in.close();
                        return true;
                    }
                    catch (Exception e ){
                        System.out.println("File not found." + e.getMessage());
                        return false;
                    }
                    finally {
                    System.exit(0);
                    return true;
                    }
                    
            }
            else if(c == 7){
                System.out.println("You have logged out");
                System.exit(0);
            }
            else {
                System.out.println("Invalid option.");
                System.exit(0);
            }
            
            Scanner read = null;
            try {
                
                read = new Scanner(new File(filename));
                String line;
                int count = 1;
                while (read.hasNextLine() && (line = read.nextLine()) !=null) 
                {
                    
                   
                    System.out.println(count + " " + line); 
                    count++;
                    stringBuffer.append(line).append("\r\n");
                }
                read.close();
                return true;
                } 
            catch (Exception e) 
                {
                System.out.println("The file " + filename + " could not be found. " + e.getMessage());
                return false;
                } 
            finally 
                {
                read.close();
                return true;
                }
    }
public static void newRecord(){
    String file = filename;
    String a = "asset.txt";
    String de = "daily expense.txt";
    String we = "weekly expense.txt";
    String me = "monthly expense.txt";
    String i = "income.txt";
    
    try {
        BufferedWriter out = new BufferedWriter(new FileWriter(filename, true));
        
        if (file.equals(a)){
            System.out.println("Enter -1 to stop.");
                sc.nextLine(); //Error without this
                
                System.out.println("Please enter your new asset: ");
                String na = sc.nextLine();
                String y ="-1";
                //sc.nextLine();
            while(!na.equals(y)){
                out.write(na);
                System.out.println("Enter the value of it: ");
                String v = sc.nextLine();
                 if (v.equals("-1"))
                    break;
                out.write(","+v);
                out.newLine();
                
                System.out.println("Please enter your new asset: ");
                na = sc.nextLine();
                if (na.equals("-1")){
                    System.out.println("New record has been saved.");
                    break;
                }
                out.write(na);
            }
            out.close();
        }
        if (file.equals(de)){
            System.out.println("Enter -1 to stop.");
                sc.nextLine(); //Error without this
                
                System.out.println("Please enter the date (dd/mm/yy): ");
                String date = sc.nextLine();
                out.write("Date," + date);
                out.newLine();
                String y ="-1";
                System.out.println("Please enter your new expense: ");
                String na = sc.nextLine();
                out.write(na);
                //sc.nextLine();
            while(!na.equals(y)){
            
                System.out.println("Enter the value of it: ");
                String v = sc.nextLine();
                 if (v.equals("-1"))
                    break;
                out.write(","+v);
                out.newLine();
                
                System.out.println("Please enter your new expense: ");
                na = sc.nextLine();
                if (na.equals("-1")){
                    System.out.println("New record has been saved.");
                    break;
                }
                out.write(na);
            }
            
            
            out.close();
        }
        if (file.equals(we)){
            System.out.println("Enter -1 to stop.");
                sc.nextLine(); //Error without this
                
                System.out.println("Please enter the week (e.g 1 of March): ");
                String date = sc.nextLine();
                out.write("Week," +date);
                out.newLine();
                String y ="-1";
                System.out.println("Please enter your new expense: ");
                String na = sc.nextLine();
                out.write(na);
                //sc.nextLine();
            while(!na.equals(y)){
                
                System.out.println("Enter the value of it: ");
                String v = sc.nextLine();
                 if (v.equals("-1"))
                    break;
                out.write(","+v);
                out.newLine();
                
                System.out.println("Please enter your new expense: ");
                na = sc.nextLine();
                if (na.equals("-1")){
                    System.out.println("New record has been saved.");
                    break;
                }
                out.write(na);
            }
            
            out.close();
        }
        if (file.equals(me)){
            System.out.println("Enter -1 to stop.");
                sc.nextLine(); //Error without this
                
                System.out.println("Please enter the month (e.g June 15): ");
                String date = sc.nextLine();
                out.write("Month," +date);
                out.newLine();
                String y ="-1";
                System.out.println("Please enter your new expense: ");
                String na = sc.nextLine();
                out.write(na);
                //sc.nextLine();
            while(!na.equals(y)){
                
                System.out.println("Enter the value of it: ");
                String v = sc.nextLine();
                if (v.equals("-1"))
                    break;
                out.write(","+v);
                out.newLine();
                
                System.out.println("Please enter your new expense: ");
                na = sc.nextLine();
                if (na.equals("-1")){
                    System.out.println("New record has been saved.");
                    break;
                }
                out.write(na);
            }
            
            out.close();
        }
        if (file.equals(i)){
            System.out.println("Enter -1 to stop.");
                sc.nextLine(); //Error without this
                
                System.out.println("Please enter the month (e.g June 15): ");
                String date = sc.nextLine();
                out.write("Month," +date);
                out.newLine();
                String y ="-1";
                System.out.println("Please enter your new income: ");
                String na = sc.nextLine();
                out.write(na);
                //sc.nextLine();
            while(!na.equals(y)){
                
                System.out.println("Enter the value of it: ");
                String v = sc.nextLine();
                 if (v.equals("-1"))
                    break;
                out.write(","+v);
                out.newLine();
                
                System.out.println("Please enter your new income: ");
                na = sc.nextLine();
                if (na.equals("-1")){
                    System.out.println("New record has been saved.");
                    break;
                }
                out.write(na);
            }
            
            out.close();
        }
            
    }
    catch (Exception x){
        System.out.println("Error editing file " + x.getMessage());
    }
}    

public static void update(int lineNumber, String name, String value) {
    array = new ArrayList<>();
    
    try {
        Scanner read = new Scanner(new File(filename));
        
            while (read.hasNextLine()){
                String line = read.nextLine();
                array.add(line.split(","));
            }
                
            read.close();
    }
    
    catch (Exception e){
        System.out.println("File not found "+e.getMessage());
    }
    
    
    try {
        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
            array.get(lineNumber-1)[0] = name;
            array.get(lineNumber-1)[1]= value;
            
         for (int i = 0; i < array.size(); i++){
            out.write(array.get(i)[0]);
            out.write(",");
            out.write(array.get(i)[1]);
            out.newLine();
         }
        out.close();
        
        
       
    }
    catch(Exception e) {
        System.out.println("Error " + e.getMessage());
    }
     
        for (int i = 0; i < array.size(); i++){
                System.out.print(array.get(i)[0] +","+array.get(i)[1]);
                System.out.println();
               
        }
    }
//public static void save(){
//    try { 
//        BufferedWriter store = new BufferedWriter(new FileWriter(filename));
//        store.write(stringBuffer.toString()); //Stores the new line to the text file.
//        store.close();
//    }
//    catch (Exception e){
//        System.out.println("Error storing new data. " + e.getMessage());
//    }
//}
}
          
    
 
