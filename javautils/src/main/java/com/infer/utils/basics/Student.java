package com.infer.utils.basics;

/**
 * Created by Anoop on 7/24/2015.
 */
public class Student implements Cloneable{

    private int studentId;
    private String studentName;
    private Department department;

    public Student(int id, String name, Department dept)
    {
        this.studentId = id;
        this.studentName = name;
        this.department = dept;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getStudentId() {
        return studentId;
    }

    public Department getDepartment() {
        return department;
    }
}