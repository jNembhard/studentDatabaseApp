# Student Database App

The Student Database App allows multiple students to enroll in multiple classes and check their tuition balances.

## Setup

Navigate into the Student Database App folder and enter the following in the command line:

```
javac -d . src/studentdatabaseapp/Student.java src/studentdatabaseapp/StudentDatabaseApp.java
```

This will create a package directory with .class files to run.

Run the following code:

```
java studentdatabaseapp.Student studentdatabaseapp.StudentDatabaseApp
```

## Basic Output

Output should look similar to this:

```
Enter number of students to enroll: 1
Enter student's first name: studentFirstName
Enter student's last name: studentLastName

1 = Freshman, 2 = Sophomore, 3 = Junior, 4 = Senior

Enter student class level: 4
Enter course to enroll (Q to quit): Math 101
Enter course to enroll (Q to quit): English 101
Enter course to enroll (Q to quit): Q
Your balance is: $1200

Enter your payment: $800
Thank you for your payment of $800
Your balance is: $400

```

All the information you entered will be displayed as a summary:

```
Name: studentFirstName studentLastName
Grade Level: 4
Student ID: 41002
Courses Enrolled:
    Math 101
    English 101
Balance: $400
```

As you can see in the above code, each student is given a unique ID. You may enroll as many students as needed.