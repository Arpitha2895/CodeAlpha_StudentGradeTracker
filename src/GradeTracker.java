import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter grade of " + name + ": ");
            double grade = sc.nextDouble();
            students.add(new Student(name, grade));
        }

        double total = 0;
        double highest = students.get(0).getGrade();
        double lowest = students.get(0).getGrade();

        for (Student s : students) {
            double g = s.getGrade();
            total += g;
            if (g > highest) highest = g;
            if (g < lowest) lowest = g;
        }

        double average = total / n;

        System.out.println("\n===== Grade Report =====");
        for (Student s : students) {
            System.out.println("Student: " + s.getName() + " | Grade: " + s.getGrade());
        }

        System.out.println("------------------------------");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}
