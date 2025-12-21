public class Main {

    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];

        for (Student s : arr) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;

        for (Student s : arr) {
            if (s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;

        for (Student s : arr) {
            sum += s.getCredits();
        }
        return sum;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Alizhan", "1", "SE");
        Student s2 = new Student("Damir", "2", "CS");
        Student s3 = new Student("Aikyn", "3", "ST");
        Student s4 = new Student("Alikhan", "4", "BD");
        Student s5 = new Student("Arailym", "5", "MT");

        s1.updateGPA(3.8); s1.addCredits(30);
        s2.updateGPA(3.2); s2.addCredits(25);
        s3.updateGPA(2.9); s3.addCredits(40);
        s4.updateGPA(2.1); s4.addCredits(20);
        s5.updateGPA(3.1); s5.addCredits(35);

        Student[] arr = {s1, s2, s3, s4, s5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("Top student: " + getTopStudent(arr));
        System.out.println("Honors count: " + countHonors(arr));
        System.out.println("Total credits: " + totalCredits(arr));

        Course course = new Course("Object-Oriented Programming", "Aidana Aidynkyzy", 5);
        course.addStudent(s1, 0);
        course.addStudent(s2, 1);
        course.addStudent(s3, 2);
        course.addStudent(s4, 3);
        course.addStudent(s5, 4);

        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest credits: " + course.highestCreditStudent());
    }
}