
class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class q4 {

    public static void main(String[] args) {
        Student s1 = new Student("Mayank", 95);
        Student s2 = new Student("Aman", 89);

        System.out.println(s1.name + " - " + s1.marks);
        System.out.println(s2.name + " - " + s2.marks);
    }
}
