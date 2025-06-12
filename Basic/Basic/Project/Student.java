import java.util.*;

public class Student extends User {
    private String id;
    private String program;
    private String batch;
    private double cgpa;
    private String msg;
    private List<String> registeredCourses = new ArrayList<>();
    private double tuitionDue = 0;

    public Student(String name, String email, String password, String id, String program, String batch) {
        super(name, email, password);
        this.id = id;
        this.program = program;
        this.batch = batch;
        this.cgpa = 0.0;
    }

    @Override
    public void displayMenu() {
        System.out.println("\nStudent Menu:");
        System.out.println("1. View Profile");
        System.out.println("2. Register Courses");
        System.out.println("3. View Tuition Due");
        System.out.println("4. Pay Tuition Fee");
        System.out.println("5. Check Important Email");
        System.out.println("6. Logout");
        UMS.clearConsole(12);

    }
    @Override
    public void viewProfile() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Program: " + program);
        System.out.println("Batch: " + batch);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Registered Courses: " + registeredCourses);
    }

    public void registerCourses(List<String> availableCourses) {
        Scanner sc = new Scanner(System.in);
        UMS.clearConsole(19);
        System.out.println("Course Selection :  ");
        int maxCoure =(4-registeredCourses.size());
        if(maxCoure>0)
        {
            System.out.println("Select "+maxCoure+" courses by index:");

            for (int i = 0; i < availableCourses.size(); i++) {
                System.out.println(i + ". " + availableCourses.get(i));
            }int i=maxCoure-1;

            while (registeredCourses.size() < maxCoure) {
                System.out.print("Enter subject index:");

                int choice = sc.nextInt();
                if (choice >= 0 && choice < availableCourses.size()) {
                    String course = availableCourses.get(choice);
                    if (!registeredCourses.contains(course)) {
                        registeredCourses.add(course);
                        System.out.println("Subject left "+i--);

                    } else {
                        System.out.println("Already selected");
                    }
                } else {
                    System.out.println("Invalid choice");
                }
            }
        }
        else
        {
            System.out.println("You already selecte 4 course\nCourese are :");
            for (String c: registeredCourses)
            {
                System.out.println(c);
            }
        }


        tuitionDue = registeredCourses.size() * 13500;
        UMS.pressEnter();
    }

    public void viewTuitionDue() {
        int i=1;
        System.out.println("Tuition fee details :");
        System.out.println("\n|----------------------------------------------------------------|");
        for(String s: registeredCourses)
        {
            System.out.println(i+". "+s+"                 13500 Taka");
            System.out.println("|----------------------------------------------------------------|");
            i++;
        }
        System.out.println("Total Tuition paid:        "    + account+" Take");
        System.out.println("|----------------------------------------------------------------|");
        System.out.println("Total Tuition Due:        "    + tuitionDue+" Take");
        System.out.println("|----------------------------------------------------------------|");

        UMS.clearConsole(8);
        UMS.pressEnter();
    }

    public void payTuitionFee() {
        Scanner sc = new Scanner(System.in);
        UMS.clearConsole(30);
        System.out.print("Enter amount to pay: ");
        double payment = sc.nextDouble();
        if (payment > 0 && payment <= tuitionDue) {
            this.tuitionDue -= payment;
            this.account+=payment;
            System.out.println("Paid: " + payment + ".\n Remaining due: " + tuitionDue);
        } else {
            System.out.println("Invalid amount");
        }
        UMS.pressEnter();
    }

    public double getCgpa(){
        return cgpa; }
    public void setCgpa(double cgpa){
        if (cgpa >= 0.0 && cgpa <= 4.0){
            this.cgpa = cgpa;
       System.out.println("Updated CGPA");
        } else{
       System.out.println("Invalid CGPA!");
        } }
    public String getProgram() {
        return program;
    }
    public void setMsg(String msg) {
        this.msg=msg; }     
    public String getBatch() {
        return batch; }
        
    public void checkMsg()
    {
        System.out.println("Notice Section :");
        System.out.println(this.msg);
        UMS.clearConsole(20);
        UMS.pressEnter();
    }


    public void updateProfile(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}