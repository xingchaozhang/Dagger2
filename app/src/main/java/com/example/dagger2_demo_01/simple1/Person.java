package com.example.dagger2_demo_01.simple1;

public class Person {

    Student student;

    public Person(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    /*// 模拟100处地方，使用Student
    public static void main(String[] args) {
        Person person = new Person(new Student(99));
    }

    // 模拟100处地方，使用Student
    public static void main2(String[] args) {
        Person person = new Person(new Student(99));
    }

    // 模拟100处地方，使用Student
    public static void main3(String[] args) {
        Person person = new Person(new Student(99));
    }

    // 模拟100处地方，使用Student
    public static void main4(String[] args) {
        Person person = new Person(new Student(99));
    }*/

    // ...

}
