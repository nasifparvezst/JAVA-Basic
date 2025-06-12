public class InformationSt {//This code related with Studentinfo class
 String name;
 String dept;
 int id;

 //Default Constructor
 InformationSt(){
    System.out.println("No Information.");
 }

 //Using Constructor(Its name will be class name)
    InformationSt(String n,String d,int i){//Parameterised constructor
        name = n;
        dept = d;
        id = i;
    }

//Normal method
void display(){
    System.out.println("Name = "+name +"\nDepertment = "+dept +"\nID = "+id+"\n");
}

}
