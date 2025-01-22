package OOPS_AC;

public class Student {
    String name;
    int roll;
    String password;
    int[] marks;
    // Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = new int[s1.marks.length];
        for(int i = 0; i<s1.marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // Default Constructor
    Student() {
        this.marks = new int[3];
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Calls the default constructor
        s1.name = "Ekansh";
        s1.roll = 77;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
        // Copy Constructor
        Student s2 = new Student(s1);
        System.out.println("Copied Student Name and Roll: " + s2.name + " " + s2.roll);
        s1.marks[2] = 500;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
