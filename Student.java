public class Student {
    // TODO: instance fields name and gpa
    private String name;
    private double gpa;
    // TODO: static int totalStudents
    private static int totalStudents;

    public Student(String name, double gpa) {
        // TODO: initialize fields
        this.name = name;
        this.gpa = gpa;
        // TODO: increment totalStudents
        totalStudents++;
    }

    public void printStudent() {
        // TODO: print name and gpa
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}