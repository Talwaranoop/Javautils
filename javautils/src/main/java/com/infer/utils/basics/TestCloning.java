package com.infer.utils.basics;

/**
 * Created by Anoop on 7/24/2015.
 */
public class TestCloning {

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Department dept = new Department(1, "Information Technology");
        Student original = new Student(1, "Anoop", dept);
        // creating a clone of original object
        Student cloned = (Student) original.clone();
        //verifying using employee id, if cloning actually worked
        System.out.println(cloned.getStudentId());

        //Must be true and objects must have different memory addresses
        System.out.println(original != cloned);
        //As we are returning same class; so it should be true
        System.out.println(original.getClass() == cloned.getClass());
        //Default equals method checks for references so it should be false. If we want to make it true,
        //we need to override equals method in Student class.
        System.out.println(original.equals(cloned));
        cloned.getDepartment().setName("Computer Science");

        System.out.println(original.getDepartment().getName());
    }
}