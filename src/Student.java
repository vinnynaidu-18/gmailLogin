public class Student {
    String name;
    String fatherName;
    String motherName;
    String mobileNumber;
    String dateofBirth;
    public  Student(String name,String fatherName,String motherName,String mobileNumber,String dateofBirth){
        this.name=name;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.mobileNumber=mobileNumber;
        this.dateofBirth=dateofBirth;




    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dateofBirth='" + dateofBirth + '\'' +
                '}';
    }
}
