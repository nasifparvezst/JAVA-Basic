public class String1{
    public static void main(String[] args){
        String S1 = "Nasif Parvez Niloy";
        String S2 = new String("Niloy");//Object

        int len = S1.length();
        int lent = S2.length();
      System.out.println("S1 = "+S1+"\t"+len);
      System.out.println("S2 = "+S2+"\t"+lent);
      //System.out.print(len);// length of S1
      
      if(S1.contains(S2)){
        System.out.println("Equals");
      }else{
        System.out.println("Not Equals.");
      } 
      String upper = S1.toUpperCase();
      System.out.println(upper);

      boolean b  = S1.contains(S2);
      System.out.println("b = "+b);

    }
}