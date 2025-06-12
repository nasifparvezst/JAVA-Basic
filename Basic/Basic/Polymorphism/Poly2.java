public class Poly2 extends Poly1 {
    static void abc(){//Method overriding
        System.out.println("Mera nam to abc.");
        
    }
    void xyz(){
        System.out.println("Iam ok.");
    }
    public static void main(String[] args) {
       abc();//no need obj cz it's static method.
       Poly1 obj = new Poly1();
       obj.xyz();
       obj = new Poly2();
       obj.xyz();
       System.out.println(obj.xyz(7));
      
    }
}
