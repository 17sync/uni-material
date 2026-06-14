
public class Main {
	
    public static void main(String[] args) {
        Student student = new Student("Ali", "S101");

        student.displayStudentInfo(); // works fine even if DB fails

        EmailService emailService = new EmailService();
        emailService.sendEmail(student);

        StudentRepository repo = new StudentRepository();
        repo.saveToDatabase(student);
    }
}
