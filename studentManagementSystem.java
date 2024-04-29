import java.util.*;
public class studentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentManagementSystem system = new studentManagementSystem();

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add a student");
            System.out.println("2. Delete a student");
            System.out.println("3. Edit a student grade");
            System.out.println("4. Display the student with the highest grade");
            System.out.println("5. Display all students");
            System.out.println("6. Print the number of students with the same grade");
            System.out.println("7. Display the names and grades of the students that scored above the average");
            System.out.println("8. Sort students by grade");
            System.out.println("9. Quit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.print("Enter student email: ");
                String email = scanner.next();
                System.out.print("Enter student grade: ");
                char grade = scanner.next().charAt(0);
                Student student = new Student(id, name, email, grade);
                system.addStudent(student);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                system.deleteStudent(id);
                System.out.println("Student deleted successfully!");
            } else if (choice == 3) {
                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter new grade: ");
                char grade = scanner.next().charAt(0);
                system.editStudentGrade(id, grade);
                System.out.println("Grade updated successfully!");
            } else if (choice == 4) {
                system.displayStudentWithHighestGrade();
            } else if (choice == 5) {
                system.displayAllStudents();
            } else if (choice == 6) {
                System.out.print("Enter grade to count: ");
                char grade = scanner.next().charAt(0);
                system.printNumberOfStudentsWithSameGrade(grade);
            } else if (choice == 7) {
                system.displayStudentsAboveAverage();
            } else if (choice == 8) {
                system.sortStudentsByGrade();
            } else if (choice == 9) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    
        scanner.close();
    }

    private ArrayList<Student> students;

    public studentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
    }

    public void editStudentGrade(int id, char grade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.get(i).setGrade(grade);
                break;
            }
        }
    }

    public void displayStudentWithHighestGrade() {
        Student highestGradeStudent = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getGrade()<highestGradeStudent.getGrade()) {
                highestGradeStudent = students.get(i);
            }
        }
        System.out.println("Student with highest grade: " + highestGradeStudent.getName());
    }

    public void displayAllStudents() {
        System.out.println("List of all students:");
        for (Student student : students) {
            System.out.println(student.display());
        }
    }

    public void printNumberOfStudentsWithSameGrade(char grade) {
        int count = 0;
        for (Student student : students) {
            if (student.getGrade()==grade) {
                count++;
            }    
        }
        System.out.println("Number of students with grade " + grade + ": " + count);
    }

    public void displayStudentsAboveAverage() {
        double total = 0;
        for (Student student : students) {
            total += Double.parseDouble(student.getGrade());
        }
        double average = total / students.size();
        System.out.println("Students above average:");
        for (Student student : students) {
            if (Double.parseDouble(student.getGrade()) > average) {
                System.out.println(student);
            }
        }
    }
    
    public void sortStudentsByGrade() {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Character.compare(s1.getGrade(), s2.getGrade());
            }
        });
        System.out.println("List of students sorted by grade:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    /*
    public void sortStudentsByGrade() {
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getGrade().compareTo(s2.getGrade());
                return Character.compare(s1.getGrade(), s2.getGrade());
            }
        });
        System.out.println("List of students sorted by grade:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    */
    
}

class Student {
    private int id;
    private String name;
    private String email;
    private char grade;


    public Student(int id, String name, String email, char grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
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
    
    public String display(){
        return "ID: " + id + " Name: " + name + " Email: " + email + " Grade: " + grade;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + ", grade=" + grade + "]";
    }
}    