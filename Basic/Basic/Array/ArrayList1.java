import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        // Methids of Adding elements in ArrayLIst
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(2, 25);
        System.out.println(num + " ");

        for (int i : num) {// another type of Print
            System.out.print(i + " ");
        }

        num.size();
        // Methods of remov elments
        num.remove(2);// we can also remove all elements using removeAll methods.
        System.out.println("\nAfter removing elements : " + num + " ");
        int ind = num.indexOf(30);
        System.out.println("Index :" + ind);
        num.set(2, 60);// changes value
        System.out.println(num);
        int see = num.get(2);// return value of index
        System.out.println(see);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.addAll(num);// adding copy elements to another array list
        System.out.println("Elements of num2 :: " + num2);

        boolean res = num.equals(num2);
        System.out.println(res);

        // sorting arraylist using method
        Collections.sort(num);// Ascending
        System.out.println("After sorting : " + num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Descending Order : " + num);
    }

}
