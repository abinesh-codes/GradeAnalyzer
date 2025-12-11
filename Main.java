public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Alice Johnson", "S001", new double[]{92, 88, 95, 90}),
            new Student("Bob Smith", "S002", new double[]{78, 82, 75, 80}),
            new Student("Charlie Brown", "S003", new double[]{65, 70, 68, 72}),
            new Student("Diana Prince", "S004", new double[]{95, 98, 96, 97}),
            new Student("Eve Davis", "S005", new double[]{55, 58, 52, 60}),
            new Student("Frank Miller", "S006", new double[]{85, 88, 87, 86})
        };
        
        GradeAnalyzer analyzer = new GradeAnalyzer(students);
        
        for (Student student : students) {
            analyzer.printStudentReport(student);
        }
        
        analyzer.printClassSummary();
        
        analyzer.printGradeDistribution();
    }
}