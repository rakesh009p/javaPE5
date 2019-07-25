package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
public class ArrayElementsCountTest {
    ArrayElementsCount arrayElementsCount;
    @Before
    public void setUp() throws Exception {
        arrayElementsCount = new ArrayElementsCount();
    }
    @After
    public void tearDown() throws Exception {
        arrayElementsCount=null;
    }
    @Test
    public void givenAStringShouldReturnCountOfEachWordThroughMap(){
        Map<String,Integer> mapExpected=new HashMap<String,Integer>();
        mapExpected.put("one",3);
        mapExpected.put("two",2);
        String input="one@one one/two-two";
        Map<String,Integer> actualResult=arrayElementsCount.arrayCount(input);
        assertEquals(mapExpected,actualResult);
    }
}