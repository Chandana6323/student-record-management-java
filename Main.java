public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent(new Student(1, "Chandana", 85));
        service.addStudent(new Student(2, "Prathap", 90));
        service.addStudent(new Student(3, "Asha", 70));
        service.addStudent(new Student(4, "Aishwarya", 92));

        service.viewStudents();
    }
}
