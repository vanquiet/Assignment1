public class Student {

    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String studentName, String studentId, String studentMajor) {
        name = studentName;
        id = studentId;
        major = studentMajor;
        gpa = 0.0;
        credits = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setId(String newId) {
        id = newId;
    }

    public void setMajor(String newMajor) {
        major = newMajor;
    }

    public void setGpa(double newGpa) {
        gpa = newGpa;
    }

    public void setCredits(int newCredits) {
        credits = newCredits;
    }

    public void addCredits(int addedCredits) {
        if (addedCredits > 0) {
            credits += addedCredits;
        }
    }

    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            gpa = newGPA;
        }
    }

    public boolean isHonors() {
        return gpa >= 3.5;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", credits=" + credits +
                '}';
    }
}
