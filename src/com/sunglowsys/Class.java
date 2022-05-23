package com.sunglowsys;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Class {
    public static void main(String[] args) {
        System.out.println("learn the code");

        //for each

        ArrayList<String> names = new ArrayList<>();
        names.add("rohit");
        names.add("mohit");
        names.add("suman");
        names.add("shivam");

        for (String str:names){
            System.out.println(str +"\t" +str.length());
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("_____________________________");

        //traversing using Iterator forward traversing
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }
        //backwards travershal of collection  ListItrator

        ListIterator<String> listIterator = names.listIterator(names.size());
        while (listIterator.hasPrevious()){
            String previous = listIterator.previous();
            System.out.println(previous);
            System.out.println("-----------------------");
        }

        //For each method
        names.forEach(e -> {
            System.out.println(e);
        });
        System.out.println("sorting of element");

        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });


        }
    }


