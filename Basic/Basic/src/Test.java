public class Test {//related with teacher class file
   public static void main(String[] args){
    
     Teacher teacher1 = new Teacher();//object
      teacher1.name = "Shamim Hasan";
      teacher1.religion = "Islam";
      teacher1.age = 28;
     // here we don't use display and parameterised method(no reason)
      System.out.println("Name = "+teacher1.name +"\nReligion = "+teacher1.religion +"\nAge = "+teacher1.age+"\n");
     
     Teacher teacher2 = new Teacher();
      teacher2.information("Farhad Uz Zaman","Islam",26);
      teacher2.display();

     Teacher teacher3 = new Teacher();
      teacher3.information("Habibullah Belali","Islam",45);
      teacher3.display();

   //   Teacher teacher4 = new Teacher("Shahriar Monzur","Islam",53);
   //    teacher3.display();

   //   Teacher teacher5 = new Teacher("Shohel Babu","Islam",38);
   //    teacher3.display();


   }
}
