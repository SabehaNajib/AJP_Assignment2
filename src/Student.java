
public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be empty or just spaces.");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }

    public static void main(String[] args) {
        // Create a valid student
        Student student1 = new Student("Alice", 85);
        student1.displayStudentInfo();

        // Attempt to create a student with an invalid name (just spaces)
        Student student2 = new Student("   ", 90);
        student2.displayStudentInfo();

        // Attempt to create a student with an invalid grade
        Student student3 = new Student("Bob", 105); 
        student3.displayStudentInfo();
    }
}

