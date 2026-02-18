public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        
        service.addStudent(new Student(1, "Chandana", 85));
        service.addStudent(new Student(2, "Prathap", 90));
        service.addStudent(new Student(3, "Asha", 70));

        System.out.println("\n--- All Students ---");
        service.viewStudents();

        
        System.out.println("\n--- Updating Student with ID 1 ---");
        service.updateStudent(1, "Chandana Updated", 95);

        
        System.out.println("\n--- Deleting Student with ID 2 ---");
        service.deleteStudent(2);

        System.out.println("\n--- Final Student List ---");
        service.viewStudents();
    }
}
