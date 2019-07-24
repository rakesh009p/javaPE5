package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysListTest {
    ArraysList arraysList;

    @Before
    public void setUp() throws Exception {
        arraysList=new ArraysList();

    }

    @After
    public void tearDown() throws Exception {
        arraysList=null;
    }
    @Test
    public void givenArrayListshouldReturnArrayListReplaceElement(){
        List<String> arrayList=new ArrayList<String>();
        arrayList.add("apple");
        arrayList.add("grapes");
        arrayList.add("melon");
        arrayList.add("berry");
        List actualvalue = arraysList.replaceArray((ArrayList) arrayList,"kiwi");
        List<String> arrayList1=new ArrayList<String>();
        arrayList1.add("kiwi");
        arrayList1.add("grapes");
        arrayList1.add("melon");
        arrayList1.add("berry");
        assertEquals(arrayList1,actualvalue);


    }
    @Test
    public void givenArrayListshouldReturnEmptyList(){
        List<String> arrayList=new ArrayList<String>();
        arrayList.add("apple");
        arrayList.add("grapes");
        arrayList.add("melon");
        arrayList.add("berry");
        List actualvalue = arraysList.removeArrayElements((ArrayList) arrayList);
        List<String> arrayList1=new ArrayList<String>();

        assertEquals(arrayList1,actualvalue);


    }
}