package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Alist1 {

    public static void main(String[] args) {


        System.out.println("Enter the number here : ");
        ArrayList <Integer> alist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//
        int sum =0;
        for(int i=0; i<= 10; i++){
            int input = sc.nextInt();

                alist.add(input);
            sum += input;

        }

        System.out.println(sum);

    }
}
