/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dharik Amin
 */
package ex46;

import java.util.Map;
import java.util.TreeMap;

public class cwf {
    static void countWordsFrequency(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();

        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++)
        {
             if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.print(entry.getKey() + ": \t");
            for(int i=0;i<entry.getValue();i++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
