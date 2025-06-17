import java.io.*;
public class Create_File_Folder {
  public static void main(String[] args) {
     File folder1 = new File("D:/File-io"); // create new folder in specific drive
     folder1.mkdir();

     File file1 = new File("D:/File-io/user1.txt");
     File file2 = new File("D:/File-io/user2.txt");
     try{
        file1.createNewFile();
        file2.createNewFile();
        System.out.println("Created new file.");
     } 
     catch (Exception e){
        System.out.println(e);
     }
   if(file1.exists()){
    System.out.println("File1 is exists.");
   }if(file2.exists()){
    System.out.println("File2 is exists.");
   }
   else{
    System.out.println("File not exists.");
   }
   file2.delete(); // deleted file2 
   
  }
}
