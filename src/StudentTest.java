public class StudentTest {
    public static void main(String[] args) {
        StudentService sd=new StudentService();
        Student s= sd.studentService("Vinny","ramakrishna","pushpa"," +91 9154021693","01/07/2002");
        System.out.println(s);



    }
}
