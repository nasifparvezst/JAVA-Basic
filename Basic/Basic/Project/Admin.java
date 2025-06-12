public class Admin extends User {

    private String role;
    public Admin(String name, String email, String password,String role) {
        super(name, email, password);
        this.role=role;
    }

    @Override
    public void displayMenu() {
        System.out.println("\nAdmin Menu:");
        System.out.println("1. Add Student");
        System.out.println("2. Add Faculty");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Add Courses");
//        System.out.println("6. View all student");
//        System.out.println("View all faculty.");
        System.out.println("6. View Students by Program or Batch");
        System.out.println("7. Update student CGPA");
        System.out.println("8. Logout");

    }

    @Override
    public void viewProfile() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Email: "+email);
        System.out.println("PassWord: "+password);
    }
}