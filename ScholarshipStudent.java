public class ScholarshipStudent extends Student {
    
    public ScholarshipStudent(int studentId, String name, double marks) {
        super(studentId, name, marks);
        calculateGrade();
    }
    
    @Override
    public void calculateGrade() {
        double originalMarks = getMarks();
        double marksWithBonus = originalMarks + 5;
        
        char grade;
        
        if (marksWithBonus >= 90) {
            grade = 'A';
        } else if (marksWithBonus >= 75) {
            grade = 'B';
        } else if (marksWithBonus >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        
        setGrade(grade);
    }
}
