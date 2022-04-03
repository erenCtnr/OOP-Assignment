/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya;


import java.io.File;

/**
 *
 * @author Lenovo
 */
public class User {
    private String name;
    private String surname;
    private String email;
    private String userName;
    private String password;
    private String address;
    private File userFile;
    private File postFile;
    public User(String name, String surname, String email, String userName, String password, int mode){
        // You must fill this section
    }
    public void viewProfile(){
        // You must fill this section
    }
    public void addPost(String post){
        //You must fill this section
        
        
    }
    public void login(String pwd){
        // you must fill this section
    }
    public void signUp(){
        //You must fill this section
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  
}
