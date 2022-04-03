package dosya;
import java.io.File;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author EREN ÇETİNER 200315070
 */
public class User {
    private String name;
    private String surname;
    private String email;
    private String userName;
    private String password;
    private String address;
    private ArrayList<String> posts;
    private File userFile;
    private File postFile;
    public User(String name, String surname, String email, String userName, String password, int mode){
        // You must fill this section
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.posts = new ArrayList<String>();
        this.userFile = new File(email + ".txt");
        this.postFile = new File(email + "posts.txt");
        
            if(!this.userFile.exists()){
                try{
                    userFile.createNewFile();
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
                    if(mode== 0){
                    writeUserInfostoTxt();
                    } 
                    getPostsFromTxt();
    }
    
    /*
    
    I tried to write the code that was shown us at class myself, after i fixed it alittle bit. 
    I could not understand perfectly but i got the logic of this topic. 
    The code still has errors that beats me. 
    Honestly, i could not learn the JAVA completely at school and this is my fault. 
    I will work on JAVA at summer and after because i respect to my teachers hard work.
    That is all i can do now.
    Thanks
    
    */
    
    public void getPostsFromTxt(){
        // You must fill this section
    }
    public void addPost(String post){
        //You must fill this section
        posts.add(post);
        
    }
    public void writePoststoTxt(){
        // you must fill this section
        try{
            FileOutputStream fos = new FileOutputStream(this.postFile);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for(int i = 0; i< posts.size();i++){
                bw.write(posts.get(i));
                bw.newLine();
            }        
            bw.close();
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public void writeUserInfostoTxt(){
        //You must fill this section
        try{
        FileOutputStream fos = new FileOutputStream(this.userFile);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        String line = this.name +"," +this.surname +","+ this.userName +"," +this.password;
        bw.write(line);
        bw.close();
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
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
    public ArrayList<String> getPosts() {
        return posts;
    }
    public void setPosts(ArrayList<String> posts)  {
        this.posts = posts;
    }
  
}
