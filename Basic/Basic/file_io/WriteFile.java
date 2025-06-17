import java.io.*;

public class WriteFile {
  public static void main(String[] args) {
     // we have a file in D:/file-io path
     try{ // Write file under the try{} block must .
     FileWriter wr = new FileWriter("D:/File-io/user1.txt");
       wr.write("My exam will start on tomorrow.");
       wr.close();
     System.out.println("Successfully wrote to the file of user1");
     } 
     catch(Exception x){
        System.out.println(x);
       x.printStackTrace();
     }
     
  }
}
