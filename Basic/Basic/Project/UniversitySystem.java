import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class UniversitySystem {
    private List<User> users = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Faculty> faculty = new ArrayList<>();
    private List<String> cseCourses = new ArrayList<>();
    private List<String> bbaCourses = new ArrayList<>();
    private List<String> lawCourses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private User currentUser;

    public UniversitySystem() {
        loadCourses();
        loadData();
    }

    public void start() {
        while (true) {
            System.out.println("\n\n                             ----->>>   Welcome to SouthEast University Management System   <<<------   ");
            System.out.println("\n                                        This portal manages student ,teacher and admin roles");
            UMS.clearConsole(12);

            System.out.println("\nLog in Here:                                                                                                -Made with Team TARA");
            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            currentUser = login(email, pass);
            if (currentUser != null) {
                System.out.println("\n\nWelcome, " + currentUser.name);
                userMenu();
            } else {
                System.out.println("\n\nInvalid login. Try again.");
                UMS.pressEnter();
                UMS.clearConsole(4);

            }
        }
    }

    private void loadCourses() {
        // Initialize sample courses for each program
        cseCourses.addAll(Arrays.asList("CSE101", "CSE102", "CSE201", "CSE202", "CSE301", "CSE302", "CSE401", "CSE402", "CSE403", "CSE404", "CSE405", "CSE406", "CSE407", "CSE408", "CSE409"));
        bbaCourses.addAll(Arrays.asList("BBA101", "BBA102", "BBA201", "BBA202", "BBA301", "BBA302", "BBA401", "BBA402", "BBA403", "BBA404", "BBA405", "BBA406", "BBA407", "BBA408", "BBA409"));
        lawCourses.addAll(Arrays.asList("LAW101", "LAW102", "LAW201", "LAW202", "LAW301", "LAW302", "LAW401", "LAW402", "LAW403", "LAW404", "LAW405", "LAW406", "LAW407", "LAW408", "LAW409"));
    }

    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat"))) {
            users = (List<User>) ois.readObject();
            for (User u : users) {
                if (u instanceof Student) students.add((Student) u);
                if(u instanceof Faculty) faculty.add((Faculty) u);
            }
        } catch (Exception e) {
            // No saved data, create default admin
            Admin admin = new Admin("admin", "admin@uni.com", "admin","UMS");
            users.add(admin);
            // System.out.println("No data found, default admin created (admin@uni.com / admin)");
        }
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat"))) {
            oos.writeObject(users);
        } catch (Exception e) {
            System.out.println("Failed to save data: " + e.getMessage());
        }
    }

    private User login(String email, String pass) {
        for (User u : users) {
            if (u.getEmail().equals(email) && u.checkPassword(pass)) {
                return u;
            }
        }
        return null;
    }

    private void userMenu() {

        boolean logout = false;
        while (!logout) {

            currentUser.displayMenu();//overRide->poly
            System.out.print("Enter choice: ");
            String input = sc.nextLine();
            switch (currentUser.getClass().getSimpleName()) {
                case "Student":
                    logout = studentActions(input);
                    break;
                case "Admin":
                    logout = adminActions(input);
                    break;
                case "Faculty":
                    logout = facultyActions(input);
                    break;
                default:
                    logout = true;
            }
        }
    }

    private boolean facultyActions(String choice)
    {
        switch (choice)
        {
            case"1":
                currentUser.viewProfile();//poly
                break;
            case"2":
                sendMsgTotheStudent();
                saveData();
                break;
            case"3":
                return true;
            default:
                System.out.println("Invalid choice ");

        }
        return false;
    }

    private boolean studentActions(String choice) {

        Student student = (Student) currentUser;
        switch (choice) {
            case "1":
                student.viewProfile();
                UMS.clearConsole(10);
                UMS.pressEnter();
                break;
            case "2":
                List<String> courses = getCoursesByProgram(student.getProgram());
                student.registerCourses(courses);
                saveData();
                break;
            case "3":
                student.viewTuitionDue();
                break;
            case "4":
                student.payTuitionFee();
                saveData();
                break;
            case "5":
                student.checkMsg();
                break;
            case "6":
                System.out.println("Logging out...");
                return true;

            default:
                System.out.println("Invalid option");
        }
        return false;
    }

    private boolean adminActions(String choice) {
        switch (choice) {

            case "1":
                addStudent();
                saveData();
                UMS.pressEnter();
                UMS.clearConsole(18);
                break;
            case "2":
                addFaculty();
                saveData();
                UMS.pressEnter();
                UMS.clearConsole(18);
                break;
            case "3":
                updateStudent();
                saveData();
                break;
            case "4":
                deleteStudent();
                saveData();
                break;
            case "5":
                addCourses();
                saveData();
                break;
            case "6":
                viewAllStudent();
                UMS.pressEnter();
                break;
            case "7":
                viewAllFaculty();
                UMS.pressEnter();
                break;
            case "8":
                viewStudentsByProgramOrBatch();
                UMS.pressEnter();
                break;
            case "9":
                updateStudentCgpa();
                saveData();
                break;
            case "0":
                System.out.println("Logging out...");
                return true;
            default:
                System.out.println("Invalid option");
        }
        return false;
    }

    //Admin Action
    private void addStudent() {
        UMS.clearConsole(18);
        System.out.print("Create Student Account:\nEnter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        System.out.print("Enter student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter program (CSE/BBA/LAW): ");
        String program = sc.nextLine();
        System.out.print("Enter batch: ");
        String batch = sc.nextLine();

        Student s = new Student(name, email, pass, id, program, batch);
        users.add(s);
        students.add(s);
        System.out.println("Student added.");
    }
    private void addFaculty() {
        UMS.clearConsole(18);
        System.out.print("Create Faculty Account: \nEnter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id =sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String departmnet= sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        Faculty f = new Faculty(name,id,departmnet, email, pass);
        users.add(f);
        faculty.add(f);
        System.out.println("Faculty added.");
        UMS.pressEnter();
        UMS.clearConsole(18);
    }
    private void updateStudent() {
        UMS.clearConsole(18);
        System.out.print("Enter student email to update: ");
        String email = sc.nextLine();
        for (Student s : students) {
            if (s.getEmail().equals(email)) {
                System.out.print("New name: ");
                String name = sc.nextLine();
                System.out.print("New email: ");
                String newEmail = sc.nextLine();
                System.out.print("New password: ");
                String newPass = sc.nextLine();
                s.updateProfile(name, newEmail, newPass);
                System.out.println("Student updated.");
                UMS.pressEnter();
                UMS.clearConsole(18);
                return;

            }
        }
        System.out.println("Student not found.");
    }
    private void updateStudentCgpa() {
        UMS.clearConsole(40);
        System.out.print("Enter student email to update CGPA: ");
        String email = sc.nextLine();
        for (Student s : students) {
            if (s.getEmail().equals(email)) {
                System.out.print("Enter new CGPA: ");
                double newCgpa = Double.parseDouble(sc.nextLine());
                s.setCgpa(newCgpa);
                System.out.println("CGPA updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    private void deleteStudent() {
        UMS.clearConsole(22);
        System.out.print("Enter student email to delete: ");
        String email = sc.nextLine();
        Student toRemove = null;
        for (Student s : students) {
            if (s.getEmail().equals(email)) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            users.remove(toRemove);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
    private void addCourses() {
        UMS.clearConsole(18);
        System.out.print("Which program? (CSE/BBA/LAW): ");
        String prog = sc.nextLine().toUpperCase();
        System.out.print("Enter new course name: ");
        String course = sc.nextLine();
        switch (prog) {
            case "CSE":
                cseCourses.add(course);
                break;
            case "BBA":
                bbaCourses.add(course);
                break;
            case "LAW":
                lawCourses.add(course);
                break;
            default:
                System.out.println("Invalid program.");
                return;
        }
        System.out.println("Course added.");
    }
    private void viewStudentsByProgramOrBatch() {
        UMS.clearConsole(19);
        System.out.print("Filter by (program/batch): ");
        String filter = sc.nextLine().toLowerCase();
        if (filter.equals("program")) {
            System.out.print("Enter program: ");
            String prog = sc.nextLine();
            int i=1;
            for (Student s : students) {
                if (s.getProgram().equalsIgnoreCase(prog)) {
                    System.out.println(i+" .");
                    i++;
                    s.viewProfile();
                }
            }
        }
        else if (filter.equals("batch")) {
            System.out.print("Enter batch: ");
            String batch = sc.nextLine();
            int i=1;
            for (Student s : students) {
                if (s.getBatch().equalsIgnoreCase(batch)) {
                    System.out.println(i+" .");
                    i++;
                    s.viewProfile();
                }
            }
        }
        else {
            System.out.println("Invalid filter.");
        }
        UMS.pressEnter();
    }
    private void viewAllStudent()
    {
        int i=1;
        UMS.clearConsole(20);
        System.out.println("Student List");
        for(Student s:students)
        {
            System.out.println(i+" .");
            i++;
            s.viewProfile();

        }
    }
    private void viewAllFaculty()
    {
        UMS.clearConsole(30);
        System.out.println("List of Faculty :");
        int i=1;
        for (Faculty f: faculty)
        {
            System.out.println(i+" .");
            i++;
            f.viewProfile();
        }

    }


    //Faculty Action
    private void sendMsgTotheStudent()
    {
        LocalDate date=LocalDate.now();
        System.out.println("Notice Section for Student");
        UMS.clearConsole(21);
        String dat= "Date :";
        dat+=String.valueOf(date);
        System.out.print("To send notice enter a notice:  ");
        String msg=sc.nextLine();
        dat+= """
               \n
                """+"Sender :  "+currentUser.name+ """  
                \n
                """+msg;
        for(Student s: students)
        {
            s.setMsg(dat);
        }



    }

    // Student Ation
    private List<String> getCoursesByProgram(String program) {
        switch (program.toUpperCase()) {
            case "CSE": return cseCourses;
            case "BBA": return bbaCourses;
            case "LAW": return lawCourses;
            default: return new ArrayList<>();
        }
    }



}