import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayStudent() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println("----------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();

                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter course: ");
                    String course = input.nextLine();

                    students.add(new Student(name, age, course));

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n===== STUDENT LIST =====");
                        for (Student student : students) {
                            student.displayStudent();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        input.close();
    }
}