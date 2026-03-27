package university.models;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }

    // FIX: Change 'String' to 'double' here
    public double getGpa() { 
        return gpa; 
    }
}
