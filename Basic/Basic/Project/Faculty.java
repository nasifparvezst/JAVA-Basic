public class Faculty extends User {
    
    private int id;
    private String department;

    public Faculty(String name,int id,String department, String email, String password) {
        super(name, email, password);
        this.department= department;
        this.id= id;
    }

    @Override
    public void displayMenu() {

        System.out.println("1. View Profile");
        System.out.println("2. Send msg to the Student");
        System.out.println("3. Log Out");
        System.out.println("More Features  coming soon...");
        UMS.clearConsole(18);
    }

    @Override
    public void viewProfile() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        UMS.pressEnter();
    }
}