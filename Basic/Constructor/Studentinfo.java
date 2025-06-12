public class Studentinfo {//This code related with InformationSt class
  public static void main(String[] args){

   InformationSt student1 = new InformationSt("Nasif Parvez Niloy","CSE",2023100534);
    student1.display();

   InformationSt student2 = new InformationSt("Sabbir Mahmud","CEVIL",2023100553);
    student2.display();

   InformationSt student3 = new InformationSt("Rahat Hossan","EEE",2023100541);
    student3.display();

   InformationSt student4 = new InformationSt("Lamia Akter","MECHANICAL",2023100089);
    student4.display();

   InformationSt student5 = new InformationSt();
    student5.display();// here this object autometically track default constructor

  }
}
