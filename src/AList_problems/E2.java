package AList_problems;

import java.util.ArrayList;
import java.util.List;

public class E2 {

//Write a Java program to insert an element into the array list at the first position.

    //Insetr JJk at 1dt position
    public static void main(String[] args) {


        List<String> anime = new ArrayList<>();

        anime.add("OPM");
        anime.add("FMA");
        anime.add("Naruto");
        anime.add("Tokyo Manji");

        System.out.println("old list " + anime);

        anime.add(0,"Jujutsu Kaisen");

        System.out.println("new list " + anime);
    }

}
