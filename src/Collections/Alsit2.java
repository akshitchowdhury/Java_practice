package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Alsit2 {
    //add a collection of 10 animes by taking input from user

    public static void main(String[] args) {

        ArrayList <String> anime = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the anime list here");
        for(int i=0; i<=10; i++){

            anime.add(sc.next()) ;
        }
        System.out.println(anime);
    }
}
