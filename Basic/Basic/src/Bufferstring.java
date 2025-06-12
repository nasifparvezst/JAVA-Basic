public class Bufferstring {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Palestine Bangladesh");
    
       System.out.println(s); // In this code all method are the part of Buffer

        s.append(" Free");
        System.out.println(s);

        s.delete(2, 9);
        System.out.println(s);

        s.setLength(10);
        System.out.println(s);

        s.reverse();
        System.out.println(s);
}
}