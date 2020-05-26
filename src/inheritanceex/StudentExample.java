package inheritanceex;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("세종대왕","123123-123123",100);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
