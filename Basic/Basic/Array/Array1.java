import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[3];
        String[] name = new String[10];
        System.out.print("Enter ::");
        for(int x : arr){
            arr[x] = input.nextInt();
        }
        System.out.println("Enter name ::");
        for(int i=0;i<name.length;i++){
            name[i] = input.nextLine();
        }
       int len = arr.length;
       System.out.println(len);
       int lent = name.length;
       System.out.println(lent);

    }
}
