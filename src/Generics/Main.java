package Generics;

public class Main {
    public static void main(String[] args) {
        MyGenericList<Integer> myGenericListForInteger = new MyGenericList<>();
        myGenericListForInteger.add(1);
        myGenericListForInteger.add(2);
        myGenericListForInteger.add(3);
        System.out.println(myGenericListForInteger.get(0)); // Output: 1
        System.out.println(myGenericListForInteger.get(1)); // Output: 2
        System.out.println(myGenericListForInteger.get(2)); // Output: 3

        int myGenericSum = 0;
        for(int i = 0; i < myGenericListForInteger.length(); i++){
            myGenericSum += myGenericListForInteger.get(i);
        }
        System.out.println("Sum of integers in myGenericListForInteger: " + myGenericSum);

        MyGenericList<Double> myListGenericForDouble = new MyGenericList<>();
        myListGenericForDouble.add(1.2);
        myListGenericForDouble.add(2.3);
        System.out.println(myListGenericForDouble.get(0)); // Output: 1.2
        System.out.println(myListGenericForDouble.get(1)); // Output: 2.3

        MyGenericList<Student> myListGenericForStudent = new MyGenericList();
        myListGenericForStudent.add(new Student("Alice", 20));
        myListGenericForStudent.add(new Student("Bob", 30));
        System.out.println(myListGenericForStudent.get(0)); //
        System.out.println(myListGenericForStudent.get(1)); //

        Compare<Integer> compareForInteger = new Compare<>();
        System.out.println("Greater value between 5 and 3 is: " + compareForInteger.greater(5, 3));

        Compare<Double> compareForDouble = new Compare<>();
        System.out.println("Greater value between 5.2 and 3.7 is: " + compareForDouble.greater(5.2, 3.7));

        Compare<String> compareForString = new Compare<>();
        System.out.println("Apples and oranges, which is greater? " + compareForString.greater("apple", "orange"));
    }
}