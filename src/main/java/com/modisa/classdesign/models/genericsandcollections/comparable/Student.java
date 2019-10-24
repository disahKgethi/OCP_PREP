package com.modisa.classdesign.models.genericsandcollections.comparable;

public class Student implements Comparable<Student> {
    String id;
    String name;
    Double cgpa;

    public Student(String id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return ("\n" + id + "\t" + name + "\t" + cgpa);
    }

    public int compareTo(Student student) {
        return this.id.compareTo(student.id);
    }
}
