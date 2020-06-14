package com.jalasoft.practices;

import com.jalasoft.practices.stream.Course;
import com.jalasoft.practices.stream.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ivoca
 * @version 1.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Student student1 = new Student("Juan", "Perez", 20, "M");
        Student student2 = new Student("Mario", "Vargas", 18, "M");
        Student student3 = new Student("Carlos", "Torrez", 21, "M");
        Student student4 = new Student("Teresa", "Pinto", 17, "F");
        Student student5 = new Student("Martha", "Perez", 22, "F");
        Student student6 = new Student("Maria", "Gonzales", 25, "F");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student5);
        studentList2.add(student6);
        studentList2.add(student3);
        studentList2.add(student4);

        Course cur1 = new Course("Dev Fun 1", 2020, 2, studentList);
        Course cur2 = new Course("Dev Fun 2", 2020, 5, studentList2);

        List<Course> courseList = new ArrayList<>();
        courseList.add(cur1);
        courseList.add(cur2);

        //Select name from curse
        courseList.stream()
                .map(course -> course.getName())
                .forEach(value -> System.out.println(value));

        // select name from curse where year = 2020
        System.out.println("..................................");
        courseList.stream()
                .filter(course -> course.getYear() == 2020)
                .map(course -> course.getName())
                .forEach(value -> System.out.println(value));

        //select * from curso where month = 5
        System.out.println("..................................");
        courseList.stream()
                .filter(course -> course.getMonth() == 5)
                .forEach(course -> System.out.println(course.toString()));

        //Select listStudent from where curso = "Dev fun 1"
        System.out.println("..................................");
        courseList.stream()
                .filter(course -> course.getName().equals("Dev Fun 1"))
                .map(course -> course.getStudentList())
                .flatMap(student -> student.stream())
                .forEach(value -> System.out.println(value.toString()));


         //select name, lastName from Student where age = 20
        System.out.println("..................................");
        courseList.stream()
                .map(curso -> curso.getStudentList())
                .flatMap(student -> student.stream())
                .filter(student -> student.getAge() == 20)
                .map(student -> student.getName() + " - " + student.getLastName())
                .forEach(value -> System.out.println(value));
    }


}
