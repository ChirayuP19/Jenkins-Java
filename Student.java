public class Student {
    public static void main(String[] args) {
        
        System.out.println("This is the Student class.");
    }
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void newStudent(String name, int age){
        System.out.println("New student created: " + name + ", Age: " + age);
    }
}
