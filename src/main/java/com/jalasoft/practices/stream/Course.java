package com.jalasoft.practices.stream;

import java.util.List;

/**
 * @author ivoca
 * @version 1.1
 */
public class Course {
    private String name;
    private int year;
    private int month;
    private List<Student> studentList;

    public Course(String name, int year, int month, List<Student> studentList) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.year + "-" + this.month;
    }
}
