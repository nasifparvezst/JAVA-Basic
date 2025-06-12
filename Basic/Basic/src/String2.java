public class String2 {
    public static void main(String[] args){
        String country = "Free Palestine";
        System.out.println(country);
      
        char s1 = country.charAt(10);
        System.out.println(s1);

        int pos = country.indexOf("e");// first letter 
        System.out.println(pos);
       pos = country.lastIndexOf("e");// Last letter
       System.out.println(pos);

    }
}
