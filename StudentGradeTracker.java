import java.util.ArrayList;

class Student {
    String name;
    int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding 3 students
        students.add(new Student("Ayush", 90));
        students.add(new Student("Karan", 84));
        students.add(new Student("Harsh", 78));

        // Display student records
        System.out.println("Student Grades:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.score);
        }

        // Calculate average, highest, and lowest
        int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        String topStudent = "", lowStudent = "";

        for (Student s : students) {
            total += s.score;
            if (s.score > highest) {
                highest = s.score;
                topStudent = s.name;
            }
            if (s.score < lowest) {
                lowest = s.score;
                lowStudent = s.name;
            }
        }

        double average = total / (double) students.size();

        // Display Summary Report
        System.out.println("\nSummary Report:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest + " by " + topStudent);
        System.out.println("Lowest Score: " + lowest + " by " + lowStudent);
    }
}

