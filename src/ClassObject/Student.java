package ClassObject;

public class Student {
    private String name;
    private String grade;
    private int roll;
    private String section;
    private int age;

    // Constructor
    public Student(String name, String grade, int roll, String section, int age) {
        this.name = name;
        this.grade = grade;
        this.roll = roll;
        this.section = section;
        this.age = age;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Roll: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Age: " + age);
    }
}
