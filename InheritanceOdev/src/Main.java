public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.userName = "Engin Demiroğ";

        Student student = new Student();
        student.userName = "Çisem Akman";

        UserManager userManager = new UserManager();

        userManager.SignUp(instructor);
        userManager.SignUp(student);


    }
}
