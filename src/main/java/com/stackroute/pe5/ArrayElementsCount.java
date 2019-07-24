package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayElementsCount {
  public static void main(String[] args)
    {
        HashMap<Character, Integer> hashMap
                = new HashMap<Character, Integer>();


         String string="my name is rakesh and i am from ";

        String a[] = string.split(" ");
        System.out.println();


        int count = 0;
        for (int i = 0; i < a.length; i++)
        for (int j=i+1;j<a.length;j++){
        {
            if(a[i]==a[j]){
                System.out.println(a[i]);
                }
            System.out.println(count);


        }
            }


        }

    }

