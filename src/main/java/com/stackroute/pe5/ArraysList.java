package com.stackroute.pe5;

import java.util.*;
import java.util.ArrayList;
public class ArraysList {
   public  ArrayList replaceArray(ArrayList arraysList,String inputString){
       arraysList.set(0, inputString);
       return arraysList;
   }
   public ArrayList removeArrayElements(ArrayList arrayList){
      arrayList=new ArrayList<String>();
       arrayList.removeAll(arrayList);
       return(arrayList);


   }}

    
