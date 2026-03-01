public class RegularStudent extends Student {
    
    public RegularStudent(int studentId, String name, double marks) {
        super(studentId, name, marks);
        calculateGrade();
    }
    
    @Override
    public void calculateGrade() {
        double marks = getMarks();
        char grade;
        
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        
        setGrade(grade);
    }
}
