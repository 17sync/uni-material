public class Main {
   
	public static void main(String[] args) {
        Teacher t = new Teacher("Ali");
        Course c = new Course("OOP");

        c.assignTeacher(t);
    }
}