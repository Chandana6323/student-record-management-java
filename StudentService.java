import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    
    public void updateStudent(int id, String newName, double newMarks) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setMarks(newMarks);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }


    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
