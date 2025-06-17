import java.io.FileReader;
import java.util.Scanner;
public class ReadFile {
  public static void main(String[] args) {
        
  try{
    FileReader re = new FileReader("D:/File-io/user1.txt");        
    Scanner my = new Scanner(re);
    while(my.hasNextLine()){
      String data = my.nextLine();
      System.out.println(data);
    }
    re.close();
    }
     catch(Exception y){
       System.out.println(y);
       y.printStackTrace();
   }
 }
}