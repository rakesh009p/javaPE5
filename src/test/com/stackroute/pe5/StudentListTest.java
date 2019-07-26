package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentListTest {
    StudentList studentList;
    StudentList studentList1;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStudenListShouldCompareAndReturnSortedList() {

        List<StudentList> students = new ArrayList<StudentList>();
        StudentList obj1 = new StudentList(1, "Ajay", 27);
        StudentList obj2 = new StudentList(2, "Sneha", 23);
        StudentList obj3 = new StudentList(3, "Simran", 37);
        StudentList obj4 = new StudentList(4, "Ajay", 22);
        StudentList obj5 = new StudentList(5, "Ajay", 29);
        StudentList obj6 = new StudentList(6, "Sneha", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);
        Collections.sort(students,new StudentSorter());
        String expected="[Student{id=3, name='Simran', age=37}, Student{id=5, name='Ajay', age=29}, Student{id=1, name='Ajay', age=27}, Student{id=2, name='Sneha', age=23}, Student{id=4, name='Ajay', age=22}, Student{id=6, name='Sneha', age=22}]";
        assertEquals(expected, students.toString());


    }
}