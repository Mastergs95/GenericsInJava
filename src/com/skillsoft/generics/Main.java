package com.skillsoft.generics;

import java.util.*;

public class Main {
    public static void main(String[]args){

        MapHelper.displayElements(100,200,300,400);

        MapHelper.displayElements(1021,new Date());

        MapHelper.displayElements("Key",new Date(),new UUID(123,999));

        Map<Integer,String>map1=new HashMap<>();
        map1.put(1,"Alice");
        map1.put(2,"Bob");

        Map<Integer,String>map2=new HashMap<>();
        map2.put(2,"Bob");
        map2.put(1,"Alice");

        System.out.println(MapHelper.mapEquals(map1,map2));

    }
}
