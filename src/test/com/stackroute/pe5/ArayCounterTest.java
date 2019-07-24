package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArayCounterTest {
    ArayCounter  arayCounter;

    @Before
    public void setUp() throws Exception {
        arayCounter= new ArayCounter();

    }

    @After
    public void tearDown() throws Exception {
        arayCounter=null;
    }
    @Test
    public void givenAStringArrayShouldReturnMapWithStringAndBooleanPair(){
        String[] array={"a","b","c","d","e","a","c","e"};
        Map<String, Boolean> outputString = new HashMap<String, Boolean>();
        outputString.put("a",true);
        outputString.put("b",false);
       outputString.put("c",true);
       outputString.put("d",false);
        outputString.put("e",true);
        System.out.println(outputString);
        Map<String, Boolean> actualResult=arayCounter.keyCountChecker(array);
        assertEquals(outputString,actualResult);
    }
}
