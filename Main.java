import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        System.out.println("=================================");
        System.out.println(" STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");
        
        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Marks");
            System.out.println("5. Find Topper");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch(choice) {
                case 1:
                    service.addStudent();
                    break;
                    
                case 2:
                    service.displayAllStudents();
                    break;
                    
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    service.searchStudentById(searchId);
                    break;
                    
                case 4:
                    System.out.print("Enter Student ID to update marks: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    service.updateMarks(updateId, newMarks);
                    break;
                    
                case 5:
                    service.findTopper();
                    break;
                    
                case 6:
                    System.out.println("Thank you for using Student Management System!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        } while(choice != 6);
        
        scanner.close();
    }
}
