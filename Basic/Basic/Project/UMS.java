import java.util.Scanner;

public class UMS {
    public static void main(String[] args) {

        UniversitySystem system = new UniversitySystem();
        system.start();
    }


    public static void clearConsole(int k)
    {
        for(int i=0;i<k;i++)
        {
            System.out.println();
        }
    }
    public static void pressEnter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to Continue <--");
        sc.nextLine();


    }



}