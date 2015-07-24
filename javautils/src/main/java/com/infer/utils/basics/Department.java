package com.infer.utils.basics;

/**
 * Created by Anoop on 7/24/2015.
 */
public class Department
{
    private int id;
    private String name;

    public Department(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}