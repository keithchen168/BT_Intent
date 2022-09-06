package vn.edu.csc.bt_intent;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String hometown;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
