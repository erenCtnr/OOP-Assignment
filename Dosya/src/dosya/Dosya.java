package dosya;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author EREN ÇETİNER 200315070
 */
public class Dosya {

    /**
     * @param args the command line arguments
     */
    public static void makePost(User u, String p){ 
        u.addPost(p);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Welcome!");
                
            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Enter surname: ");
            String surName = input.nextLine();
            System.out.println("Enter email: ");
            String email = input.nextLine();
            System.out.println("Enter username: ");
            String userName = input.nextLine();
            System.out.println("Enter password: ");
            String password = input.nextLine();
            
                User u = new User( name,surName,email,userName,password,0);
                
                    while(true){
                        System.out.println("Choose your operation: ");
                    
                        System.out.println("1-Post");
                        System.out.println("2-TimeLine");
                        System.out.println("3-Exit");
                    
                            int choosedOp = input.nextInt();
                        
                                if(choosedOp == 1){
                                    System.out.println("Enter your post: ");
                                    String p = input.nextLine();
                                    makePost(u, p);
                                }
                                    else if(choosedOp == 2){
                                        viewTimeLine(u);
                                    }
                                        else if(choosedOp == 3){
                                            u = null;
                                                break;
                                        }
                
                    }
        
        
    }

    private static void viewTimeLine(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 