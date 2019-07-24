package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ElementSwapTest {
    ElementSwap elementSwap;

    @Before
    public void setUp() throws Exception {
        elementSwap = new ElementSwap();
    }

    @After
    public void tearDown() throws Exception {
        elementSwap=null;
    }
    @Test
    public void givenStringShouldReplaceAnotherString(){

            String expexted="{input2=rakesh, input1= }";
            Map<String, String> map=new HashMap<String,String>();
            map.put("input1","rakesh");
            map.put("input2","rakhi");
            String actual=elementSwap.swapValue(map);
            assertEquals(expexted,actual);
    }
    @Test
    public void givenNullShouldReturnError(){
        String actual=elementSwap.swapValue(null);
        assertEquals("should not be null",actual);
    }
}