package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet sortedSet;

    @Before
    public void setUp() throws Exception {
        sortedSet=new SortedSet();

    }

    @After
    public void tearDown() throws Exception {
        sortedSet=null;
    }
    @Test
    public void givenStringShouldReturnSortedSet(){
        Set<String> inputString = new HashSet<String>() ;
            inputString.add("rakesh");
            inputString.add("my");
            inputString.add("name");
            inputString.add("is");

        List actualList =sortedSet.arraySorter( inputString);
        System.out.println(inputString);
         Set<String> outputString = new TreeSet<String>();
         outputString.add("is");
         outputString.add("my");
         outputString.add("name");
         outputString.add("rakesh");
         List expectedList = sortedSet.arraySorter(outputString);
        System.out.println(outputString);
         assertEquals(expectedList,actualList);





        }
    }
