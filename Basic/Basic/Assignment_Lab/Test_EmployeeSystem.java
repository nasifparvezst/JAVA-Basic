public class Test_EmployeeSystem {
 
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Nasif", 101, 50000, 10000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Parvez", 1001, 50, 100);
        PartTimeEmployee emp5 = new PartTimeEmployee("Masud", 1002, 50, 80);
        FullTimeEmployee emp3 = new FullTimeEmployee("Niloy", 102, 40000, 7000);
        FullTimeEmployee emp4 = new FullTimeEmployee("Anis", 103, 42000, 7500);

        System.out.println("\n=== Full-Time Employee ===");
        emp1.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();

        System.out.println("\n=== Part-Time Employee ===");
        emp2.displayDetails();
        emp5.displayDetails();

        System.out.println("\nTotal Employees Created: " + Employee.getEmployeeCount());
    }
}

