public class Teacher { // related with test class file
 
    String name,religion;
    int age;
    
//     //Using Constructor
//    Teacher(String n,String r,int a){
//         name = n;
//         religion = r;
//         age = a;
//   }

    //Parameterised method
    void information(String name,String r,int a){
        this.name = name;
        religion = r;
        age = a;
    }

   //Normal method
    void display(){
        System.out.println("Name = "+name +"\nReligion = "+religion +"\nAge = "+age+"\n");
    }

}
