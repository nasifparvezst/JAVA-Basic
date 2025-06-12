public class Employee {
    private String name;
    private int id;
    private static int employeeCount = 0; 
    protected double baseSalary;


     Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public double calculateSalary() {
        return baseSalary;
    }

    public void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("ID: " + id);
        System.out.println("Base Salary: " + baseSalary);
    }
}




