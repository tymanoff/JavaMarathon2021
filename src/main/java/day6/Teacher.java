package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public void evaluate(Student student){
        int min = 2;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        String grade = "";
        if(i==2){
            grade = "неудовлетворительно";
        }else if(i==3){
            grade = "удовлетворительно";
        } else if(i==4){
            grade = "хорошо";
        }else {
            grade = "отлично";
        }


        System.out.println("Преподователь " + name + " оценил студента с именем "
                + student.getName() + " по предмету " + subject + " на оценку " + grade);
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
