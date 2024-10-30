package tregulov.streamLess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 22, 'm', 3, 8.3);
        Student st2 = new Student("Mary", 28, 'f', 5, 7.3);
        Student st3 = new Student("Igor", 35, 'q', 2, 5.5);
        Student st4 = new Student("Elen", 19, 'f', 1, 6.9);
        Student st5 = new Student("Oleg", 23, 'r', 4, 6.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
         // метод ченинг, сортируем студентов по полу и возрасту
        students.stream().map(element ->
        {element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter(element -> element.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(element ->System.out.println(element));

//        students = students.stream().filter(e ->
//                        e.getAge() > 22 && e.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());

//        System.out.print(students);

       students =  students.stream().sorted((x,y)->
               x.getName().compareTo(y.getName())
               ).collect(Collectors.toList());
       System.out.println(students);


    }

}

class Student1 {
    private String name;
    private int age;
    private char sex;
    private int course;
    private double avgGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public Student1(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

