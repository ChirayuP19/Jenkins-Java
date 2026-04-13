public class Main {
    public static void main (String[] args) {
        System.out.println("This is a Java program. and Jenkins is running this program.");
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(java.time.LocalDateTime.now().getHour());
        Student student= new Student("Chirayu", 20);
        System.out.println("Student created: " + student.getName() + ", Age: " + student.getAge());
        student.newStudent("Kavya",22);
    }
}