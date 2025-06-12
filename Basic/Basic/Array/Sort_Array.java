import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        int[] num = { 2, 7, -7, 3, 0, 5 };
        Arrays.sort(num);//method of ascending order
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + num[i]);
        }
          System.out.println();
        String[] name = { "niloy ","abir ","alif ","rimon ","sopon " };
        Arrays.sort(name);
        for (int i = 0; i < name.length; i++) {
            System.out.print(" " + name[i]);
        }

    }
}
