class Student {
    private String name;
    private String id;
    private double[] grades;
    
    public Student(String name, String id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
    
    public String getName() { return name; }
    public String getId() { return id; }
    public double[] getGrades() { return grades; }
    
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }
    
    public char getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
    
    public double getHighestGrade() {
        double max = grades[0];
        for (double grade : grades) {
            if (grade > max) max = grade;
        }
        return max;
    }
    
    public double getLowestGrade() {
        double min = grades[0];
        for (double grade : grades) {
            if (grade < min) min = grade;
        }
        return min;
    }
}