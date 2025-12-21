public class Course {

    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseNameInput, String instructorInput, int size) {
        courseName = courseNameInput;
        instructor = instructorInput;
        students = new Student[size];
    }

    public void addStudent(Student student, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = student;
        }
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                sum += students[i].getGpa();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    public Student highestCreditStudent() {
        Student maxStudent = null;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (maxStudent == null ||
                        students[i].getCredits() > maxStudent.getCredits()) {
                    maxStudent = students[i];
                }
            }
        }

        return maxStudent;
    }

    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}

