import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students;
    private Scanner scanner;
    
    public StudentService() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void addStudent() {
        System.out.println("\n--- Add Student ---");
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        
        System.out.print("Student Type (1-Regular / 2-Scholarship): ");
        int type = scanner.nextInt();
        
        Student student;
        if (type == 1) {
            student = new RegularStudent(id, name, marks);
        } else {
            student = new ScholarshipStudent(id, name, marks);
        }
        
        students.add(student);
        System.out.println("Student added successfully!");
    }
    
    public void displayAllStudents() {
        System.out.println("\n--- All Students ---");
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        
        for (Student s : students) {
            s.displayDetails();
        }
    }
    
    public void searchStudentById(int id) {
        System.out.println("\n--- Search Result ---");
        for (Student s : students) {
            if (s.getStudentId() == id) {
                s.displayDetails();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }
    
    public void updateMarks(int id, double newMarks) {
        for (Student s : students) {
            if (s.getStudentId() == id) {
                s.setMarks(newMarks);
                s.calculateGrade();
                System.out.println("Marks updated successfully!");
                s.displayDetails();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }
    
    public void findTopper() {
        System.out.println("\n--- Topper ---");
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        
        Student topper = students.get(0);
        for (Student s : students) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        
        System.out.println("Topper is:");
        topper.displayDetails();
    }
}