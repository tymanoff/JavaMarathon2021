package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Loli");
        human.printInfo();

        Student student = new Student("lilit","poki");
        student.printInfo();

        Teacher teacher = new Teacher("Mini","sound");
        teacher.printInfo();

        System.out.println(student.getGroupName());

        System.out.println(teacher.getSubjectName());

    }
}
