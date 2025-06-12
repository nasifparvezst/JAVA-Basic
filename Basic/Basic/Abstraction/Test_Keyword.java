public class Test_Keyword {
    public static void main(String[] args) {
        
        Special_Keywords obj= new Special_Keywords();
       System.out.println(obj.batch);

       Final objj = new Final(10,10,20);
       System.out.println(objj.name);
       System.out.println(obj.batch);  // 64
       System.out.println(obj.fees);   // 710000
       obj.display();
       
       System.out.println(objj.show());
    }
}
