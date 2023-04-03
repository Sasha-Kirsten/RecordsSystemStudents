import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentMain {

    private static ArrayList<Student> students = new ArrayList<>();// Here we create the array list to store all the students (Objects) and their information.

    public static void main(String[] args) throws IOException {

        students.add(new Student("Bert Smith", "computing", 21, 12345, true, 52, 63, 76, 68));

        students.add(new Student("Olivia Green", "computing", 19, 23464, true, 73, 82, 72, 66));

        students.add(new Student("Eloise Jones", "computing", 18, 34744, true, 65, 63, 37, 40));

        students.add(new Student("Ben Bird", "computing", 42, 34834, false, 55, 29, 56, 38));

        students.add(new Student("Karen Brown", "computing", 25, 45632, false, 62, 51, 43, 43));

        String userinput;

        do {// Here we print out the menu to the user, so that they can see what options they have on the system.
            System.out.println("Here is the menu system:\n" +
                    "1: Print out a report of all students including lettered grades for each module score\n"
                    + "2: Print the name of all students with a failed module\n"
                    + "3: Print out average grade for each student\n"
                    + "4: Add a new student to the system taking in name, department, age, student number and a grade for each of the four modules.\n"
                    + "5:Quit the program\n");

            Scanner in = new Scanner(System.in);//Here we declared the Scanner variable, to read user's input.
            userinput = in.nextLine();// the variable user input will store the user input.

            switch (userinput) {
                case "1":
                    //Print out a report of all students including lettered grades for each module score
                    for (int x = 0; x < students.size(); x++) {
                        System.out.println(students.get(x));
                    }
                    System.out.println("");
                    break;
                case "2":
                    //Print the name of all students with a failed module
                    for (int y = 0; y < students.size(); y++) {
                        if (students.get(y).webDev < 40) {
                            System.out.println(students.get(y).Name + "'s Grade for Web development: "+ students.get(y).webDev);
                        }
                        else if(students.get(y).programming < 40){
                            System.out.println(students.get(y).Name + "'s Grade: Programming"+ students.get(y).programming);
                        }
                        else if(students.get(y).maths < 40){
                            System.out.println(students.get(y).Name + "'s Grade: Maths"+ students.get(y).maths);
                        }
                        else if(students.get(y).algorithms < 40){
                            System.out.println(students.get(y).Name + "'s Grade: Algorithms"+ students.get(y).algorithms);
                        }
                    }
                    break;
                case "3":
                    //Print out average grade for each student
                    int average =0;
                    for(int i =0; i< students.size(); i++){
                        average = average+(students.get(i).webDev + students.get(i).programming + students.get(i).maths + students.get(i).algorithms)/4;
                    }
                    System.out.println("The average grade is: "+ average);
                    break;
                case "4":
                    //Add a new student to the system taking in name, department, age, student number and a grade for each of the four modules.
                    System.out.println("What is the full name of the student:");
                    String input1 = in.next() + " " +in.next();

                    System.out.println("What is their Department: ");
                    String input2 = in.next();

                    System.out.println("What is their age: ");
                    int input3 = in.nextInt();

                    System.out.println("What is their student ID number: ");
                    int input4 = in.nextInt();

                    System.out.println("Are they full time student(true/false): ");
                    boolean input5 = in.nextBoolean();

                    System.out.println("What is their score for programming: ");
                    int input6 = in.nextInt();

                    System.out.println("What is their score for web development: ");
                    int input7 = in.nextInt();

                    System.out.println("What is their score for maths: ");
                    int input8 = in.nextInt();

                    System.out.println("What is their score for algorithms: ");
                    int input9 = in.nextInt();

                    //Here we add the students to the array list students with the other students.
                    students.add(new Student(input1, input2, input3, input4, input5, input6, input7, input8, input9));
                    break;
                case "5":
                    //Quit the program.
                    break;
            }
        } while (userinput != "5");{// Here we check the if the user enters 5, which is the exit button from the system.
            System.out.println("Thank you, have a good day!");
        }
    }
}

// ############################################################################################################################################################################
// ######################################################################################

// import java.util.ArrayList;
// import java.util.Scanner;

// public class StudentMain {
//     private static ArrayList<Student> students = new ArrayList<>();

//     public static void main(String[] args) {
//         // Create sample students and grades
//         Student student1 = new Student("Bert", "Smith", 20, "CS", 12345, true);
//         student1.addGrade(new Grade("Math", 75));
//         student1.addGrade(new Grade("English", 50));

//         Student student2 = new Student("Alice", "Johnson", 22, "Physics", 67890, false);
//         student2.addGrade(new Grade("Physics", 90));
//         student2.addGrade(new Grade("Chemistry", 85));

//         students.add(student1);
//         students.add(student2);

//         Scanner scanner = new Scanner(System.in);
//         int option;

//         do {
//             System.out.println("Menu:");
//             System.out.println("1. Print report of all students with lettered grades");
//             System.out.println("2. Print the name of all students with a failed module");
//             System.out.println("3. Print the average grade for each student");
//             System.out.println("4. Add a new student");
//             System.out.println("5. Quit");
//             System.out.print("Enter your choice: ");
//             option = scanner.nextInt();

//             switch (option) {
//                 case 1:
//                     printReport();
//                     break;
//                 case 2:
//                     printFailedStudents();
//                     break;
//                 case 3:
//                     printAverageGrades();
//                     break;
//                 case 4:
//                     addNewStudent(scanner);
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid option. Please try again.");
//             }
//         } while (option != 5);
//         scanner.close();
//     }

//     public static void printReport() {
//         for (Student student : students) {
//             System.out.println(student.toString());
//             for (Grade grade : student.getGrades()) {
//                 System.out.println(grade.getSubject() + ": " + grade.getScore() + " - " + Grade.getLetterGrade(grade.getScore()));
//             }
//             System.out.println();
//         }
//     }

//     public static void printFailedStudents() {
//         for (Student student : students) {
//             boolean hasFailed = false;
//             for (Grade grade : student.getGrades()) {
//                 if (Grade.getLetterGrade(grade.getScore()) == 'F') {
//                     hasFailed = true;
//                     break;
//                 }
//             }
//             if (hasFailed) {
//                 System.out.println(student.getName());
//             }
//         }
//     }

//     public static void printAverageGrades() {
//         for (Student student : students) {
//             double totalScore = 0;
//             for (Grade grade : student.getGrades()) {
//                 totalScore += grade.getScore();
//             }
//             double average = totalScore / student.getGrades().size();
//             System.out.println(student.getName() + ": " + average);
//         }
//     }

//     public static void addNewStudent(Scanner scanner) {
//         System.out.print("Enter first name: ");
//         String firstName = scanner.next();
//         System.out.print("Enter last name: ");
//         String lastName = scanner.next();
//         System.out.print("Enter age: ");
//         int age = scanner.nextInt();
//         System.out.print("Enter department: ");
//         String department = scanner.next();
//         System.out.print("Enter student number: ");
//         int studentNumber = scanner.nextInt();
//         System.out.print("Is the student full-time? (yes or no): ");
//         boolean fullTime = scanner.next().equalsIgnoreCase("yes");

//         Student newStudent = new Student
// }


// ############################################################################################################################################################################
// ######################################################################################


// import java.util.ArrayList;
// import java.util.Scanner;

// public class StudentMain {
//     private static ArrayList<Student> students = new ArrayList<>();

//     public static void main(String[] args) {
//         // Create sample students and grades
//         // ...

//         Scanner scanner = new Scanner(System.in);
//         int option;

//         do {
//             // Menu options
//             // ...

//             switch (option) {
//                 // ...
//                 case 4:
//                     addNewStudent(scanner);
//                     break;
//                 // ...
//             }
//         } while (option != 5);
//         scanner.close();
//     }

//     // Other methods
//     // ...

//     public static void addNewStudent(Scanner scanner) {
//         System.out.print("Enter first name: ");
//         String firstName = scanner.next();
//         System.out.print("Enter last name: ");
//         String lastName = scanner.next();
//         System.out.print("Enter age: ");
//         int age = scanner.nextInt();
//         System.out.print("Enter department: ");
//         String department = scanner.next();
//         System.out.print("Enter student number: ");
//         int studentNumber = scanner.nextInt();
//         System.out.print("Is the student full-time? (yes or no): ");
//         boolean fullTime = scanner.next().equalsIgnoreCase("yes");

//         Student newStudent = new Student(firstName, lastName, age, department, studentNumber, fullTime);

//         System.out.println("Enter the grades for the four modules:");
//         for (int i = 1; i <= 4; i++) {
//             System.out.print("Module " + i + " subject: ");
//             String subject = scanner.next();
//             System.out.print("Module " + i + " score: ");
//             double score = scanner.nextDouble();
//             newStudent.addGrade(new Grade(subject, score));
//         }

//         students.add(newStudent);
//         System.out.println("New student added successfully.\n");
//     }
// }




















