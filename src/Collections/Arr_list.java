package Collections;

import java.util.*;
public class Arr_list {

    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();

        list1.add(24);
        list1.add(25);
        list1.add(26);
        list1.add(27);

        System.out.println(list1);
        System.out.println(list1.get(0)+ list1.get(1));
        System.out.println(list1.add(46));
        System.out.println(list1);
        System.out.println(list1.set(2, 40));
        System.out.println(list1);
    }
}
