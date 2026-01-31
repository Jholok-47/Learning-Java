import ClassObject.Student;

public class OOP {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "A", 101, "A1", 20);
        Student student2 = new Student("Bob", "B", 102,"B1", 21);
        Student student3 = new Student("Charlie", "A", 103,"A2", 19);
        Student student4 = new Student("Diana", "C", 104,"C1", 22);

        System.out.println("Student 1 Details:");
        student1.displayInfo();
        System.out.println("\nStudent 2 Details:");
        student2.displayInfo();
        System.out.println("\nStudent 3 Details:");
        student3.displayInfo();
        System.out.println("\nStudent 4 Details:");
        student4.displayInfo();
    }
}
