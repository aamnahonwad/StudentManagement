public abstract class Student {
    private int studentId;
    private String name;
    private double marks;
    private char grade;
    
    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.grade = 'N';
    }
    
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }
    
    public char getGrade() { return grade; }
    public void setGrade(char grade) { this.grade = grade; }
    
    public abstract void calculateGrade();
    
    public void displayDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Marks: " + marks + ", Grade: " + grade);
    }
}