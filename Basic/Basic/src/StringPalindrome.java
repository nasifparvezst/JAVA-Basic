public class StringPalindrome {
    public static void main(String[] args){
        String s1 = "NoyoN";
        StringBuffer s2 = new StringBuffer(s1);

         String s3 = s2.reverse().toString();
         if(s1.equals(s3)){
            System.out.println("Equals.");
         }else{
            System.out.println("Not Equals.");
         }
    }
}
