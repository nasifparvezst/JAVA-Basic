interface Dog {
   void show();  //automatic access static and abstract before void
  
}
interface Bird{
    void print();    //automatic access static and abstract before void
}
class Cat implements Dog,Bird{
    public void show(){
        System.out.println("Iam cat Implements Dog.");
    }
    public void print(){
        System.out.println("Iam cat implements Bird.");
    }
  
}