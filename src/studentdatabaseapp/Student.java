package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.print("1 = Freshman, 2 = Sophomore, 3 = Junior, 4 = Senior\n\n" +
                "Enter student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();

            if (!course.equals( "Q")) {
                courses = courses + "\n\t" + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            }else{break;}
        } while (1 != 0);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance + "\n");
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("\nEnter your payment: $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String showInfo() {
        return  "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance + "\n";
    }
}
