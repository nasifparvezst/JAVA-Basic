public class Static1 {
    String name;
    int id;
    static String dept = "SEU";
    static int count = 0;
    
    Static1(String n,int i){  // Its a constructor
        name =n;
        id = i;
        count ++;
    }
    
    void display(){
        System.out.println(name+" " +id+" " +dept+"   "+count);
    }
}
