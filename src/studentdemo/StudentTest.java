package studentdemo;

public class StudentTest {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        StudentProcessService sp = new StudentProcessService();
       String message = sp.Student(s);
       System.out.println(message);

    }
}
