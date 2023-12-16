package AList_problems;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;

public class E1 {

//    Write a Java program to create an array list, add some colors (strings) and print out the collection.

    public static void main(String[] args) {
        ArrayList <String> items = new ArrayList<>();

        items.add("Blue");
        items.add("Red");
        items.add("Yellow");
        items.add("Green");
        items.add("Black");

        int i=0;
        while(i< items.size()){

            System.out.println(items.get(i));

            i++;
        }
    }


}
