package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
    public List<String > arraySorter(Set<String> inputString){
        Set<String>  sorted = new TreeSet<String>(inputString);
        List<String> list = new ArrayList<String>(sorted);
        return list;

    }


}
