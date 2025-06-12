public class Special_Keywords {

    String name = "SEU";
    final int batch = 64;
    final int fees;

    Special_Keywords() {
        fees = 710000;
    }

    int a,c;
    Special_Keywords(int a,int c){
        this.a = a;
        this.c = c;
        this.fees = 710000;//must initialize here cz once constructor use final
    }

    void display() {
        System.out.println("From super class.");
    }
}

 class Final extends Special_Keywords{

    int batch = 70;
    int d;
   //Final class not allow inherit
   //Final method can't be overriden
   Final(int a,int c,int d){
    super(a,c);
      this.d = d;
   }

    void display() {

        System.out.println("From child class.");
        super.display();
        System.out.println("d :"+d);
    }
    int show(){        
        return a+c+d;
    }
 }