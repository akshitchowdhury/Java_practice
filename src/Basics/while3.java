package Basics;

public class while3 {

    //calculate sum of numbers from 1 to 100

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;
        while(num<=100){

//            System.out.println(num);

            sum = sum+ num;

            num++;
        }

        System.out.println("Viola "+ sum);

    }

}
