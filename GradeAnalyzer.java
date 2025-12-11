
class GradeAnalyzer {
    private Student[] students;
    
    public GradeAnalyzer(Student[] students) {
        this.students = students;
    }
    
    public double getClassAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.calculateAverage();
        }
        return students.length > 0 ? sum / students.length : 0;
    }
    
    public Student getTopStudent() {
        if (students.length == 0) return null;
        
        Student top = students[0];
        for (Student student : students) {
            if (student.calculateAverage() > top.calculateAverage()) {
                top = student;
            }
        }
        return top;
    }
    
    public int getPassCount() {
        int count = 0;
        for (Student student : students) {
            if (student.calculateAverage() >= 60) {
                count++;
            }
        }
        return count;
    }
    
    public int getFailCount() {
        return students.length - getPassCount();
    }
    
    public void printGradeDistribution() {
        int[] distribution = new int[5]; // A, B, C, D, F
        
        for (Student student : students) {
            char grade = student.getLetterGrade();
            switch (grade) {
                case 'A': distribution[0]++; break;
                case 'B': distribution[1]++; break;
                case 'C': distribution[2]++; break;
                case 'D': distribution[3]++; break;
                case 'F': distribution[4]++; break;
            }
        }
        
        System.out.println("\n=== Grade Distribution ===");
        System.out.println("A: " + distribution[0] + " students");
        System.out.println("B: " + distribution[1] + " students");
        System.out.println("C: " + distribution[2] + " students");
        System.out.println("D: " + distribution[3] + " students");
        System.out.println("F: " + distribution[4] + " students");
    }
    
    public void printStudentReport(Student student) {
        System.out.println("\n=== Student Report ===");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.print("Grades: ");
        for (double grade : student.getGrades()) {
            System.out.print(grade + " ");
        }
        System.out.println("\nAverage: " + String.format("%.2f", student.calculateAverage()));
        System.out.println("Letter Grade: " + student.getLetterGrade());
        System.out.println("Highest Grade: " + student.getHighestGrade());
        System.out.println("Lowest Grade: " + student.getLowestGrade());
    }
    
    public void printClassSummary() {
        System.out.println("\n=== Class Summary ===");
        System.out.println("Total Students: " + students.length);
        System.out.println("Class Average: " + String.format("%.2f", getClassAverage()));
        System.out.println("Students Passing: " + getPassCount());
        System.out.println("Students Failing: " + getFailCount());
        
        Student top = getTopStudent();
        if (top != null) {
            System.out.println("Top Student: " + top.getName() + 
                             " (Average: " + String.format("%.2f", top.calculateAverage()) + ")");
        }
    }
}
