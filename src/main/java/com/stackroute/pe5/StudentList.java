package com.stackroute.pe5;

import java.util.Comparator;

public class StudentList {
    private int id;
    private String name;
    private int age;

    //constructor
    public StudentList(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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


}

class StudentSorter implements Comparator<StudentList> {

//    Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

    @Override
    public int compare(StudentList studentList, StudentList studentList1) {
        if (studentList.getAge() == studentList1.getAge()) {
            if (studentList.getName().equals(studentList1.getName()))
                return studentList1.getId() - studentList.getId();
            else
                return studentList1.getName().compareTo(studentList1.getName());
        } else {
            return studentList1.getAge() - studentList.getAge();
        }
    }
}

