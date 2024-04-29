import java.util.Scanner;
public class testStudent {
    public static void main(String[] args) {
        String name;
        int id;
        String email;
        char grade;
        int size = 5;
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        // create an array that contains the list of students that allows the user to edit the list
        Student[] students = new Student[size];
        // create a while loop that allows the user to choose from the menu
        while (true) {
            printMenu();
  
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (size>=students.length){
                        System.out.println("The list is full, you can't add more students!");
                        break;
                    }    
                        // add a student
                        System.out.println("Enter the name of the student: ");
                        name = sc.nextLine();
                        System.out.println("Enter the id of the student: ");
                        id = sc.nextInt();
                        System.out.println("Enter the email of the student: ");
                        email = sc.next();
                        System.out.println("Enter the grade of the student: ");
                        grade = sc.next().charAt(0);
                        Student student = new Student(name, id, email, grade);
                        // add the student to the array
                        for (int i = 0; i < students.length; i++) {
                            if (students[i] == null) {
                                students[i] = student;
                                break;
                            }
                        }
                    break;
                case 2:
                    // delete a student
                    System.out.println("Enter the id of the student you want to delete: ");
                    id = sc.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getId() == id) {
                            students[i] = null;
                            break;
                        }
                    }
                    break;
                case 3:
                    // edit a student grade
                    System.out.println("Enter the id of the student you want to edit: ");
                    id = sc.nextInt();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getId() == id) {
                            System.out.println("Enter the new grade of the student: ");
                            students[i].setGrade(sc.next().charAt(0));
                            break;
                        }
                    }
                    break;
                case 4:
                    // display the student(s) with the highest grade
                    char maxGrade = students[0].getGrade();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getGrade() > maxGrade) {
                            maxGrade = students[i].getGrade();
                        }
                    }
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getGrade() == maxGrade) {
                            System.out.println(students[i].getName());
                        }
                    }
                    break;
                case 5:
                    // display all students
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println(students[i].getName());
                        }
                    }
                    break;
                case 6:
                    // print the number of students with the same grade
                    System.out.println("Enter the grade you want to check: ");
                    grade = sc.next().charAt(0);
                    int count = 0;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].getGrade() == grade) {
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;
                case 7:
                case 8:
                case 9:
                    System.out.println("Thank you, goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again!");
                    break;
            }
            break;
        }
        sc.close();
    }

    public static void printMenu() {
        System.out.println("1. Add a student");
        System.out.println("2. Delete a student");
        System.out.println("3. Edit a student grade");
        System.out.println("4. Display the student(s) with the highest grade");
        System.out.println("5. Display all students");
        System.out.println("6. Print the number of students with the same grade");
        System.out.println("7. Display the names and the grades of the students that scored above the average");
        System.out.println("8. Sort and display students by grade");
        System.out.println("9. Exit");
    }

    static class Student {
        private String name;
        private int id;
        private String email;
        private char grade;

        // Constructor
        public Student(String name, int id, String email, char grade) {
            this.name = name;
            this.id = id;
            this.email = email;
            this.grade = grade;
        }
        // Getters    
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public String getEmail() {
            return email;
        }
        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }
    }

}