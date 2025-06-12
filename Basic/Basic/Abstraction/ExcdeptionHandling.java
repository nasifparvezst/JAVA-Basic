public class ExcdeptionHandling {
    public static void main(String[] args) {
      int a = 10;
      int b = 0;
      try{
      int res = a/b;
    System.out.println("Result is : "+res);
      }
      catch (Exception x){
         System.out.println("Find Exception");
      }
      finally{

        System.out.println("Done it.");
        int ros = a/b;
        System.out.println("res ="+ros);
        System.out.println("Ok");
      }
  }
}
