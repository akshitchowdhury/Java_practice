package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the entries of books");
//
//        System.out.println("Enter the size of the books");


        List<String> books = new ArrayList<>();




        books.add(sc.next());
        books.add(sc.next());
        books.add(sc.next());
        books.add(sc.next());

        int i = 0;
        while(i<books.size()){

            System.out.println(books.get(i));
            i++;
        }
        System.out.println("DO you want to close the program?");

        String choice = sc.next();

        if(choice == "yes"){
            sc.close();
        }


    }
}
