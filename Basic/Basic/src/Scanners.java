import java.util.Scanner;
public class Scanners {
    public static void main(String[] args){

   //Direct value
    int num = 110;
    System.out.println("number = "+num);
    System.out.println(num);
    
    //Int value from user 
    //int number;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number :");
    int number = input.nextInt();
    System.out.println("number = "+number);
    
    //String from user
    input.nextLine();
    String name;
    System.out.print("Enter Name :");
    name = input.nextLine();
    System.out.println("Hello Mr. "+name);

}
}