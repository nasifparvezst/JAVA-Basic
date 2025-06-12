public abstract class Abstract1 {
    int a,b;
   
  abstract  void menu();//Abstract method
  
  final void info(){
    System.out.println("This method can't be overriden.");
  }
    
    Abstract1(int a,int b){
        this.a = a;
        this.b =b;
    }
}

class Abstract2 extends Abstract1{
    Abstract2(int a, int b) {
        super(a, b);
    }
    
    void menu(){
     int res = a+b;
     System.out.println(res); 
    }
}