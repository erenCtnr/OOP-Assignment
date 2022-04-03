package dosya;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author EREN ÇETİNER 200315070
 */
public class test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
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
}
}