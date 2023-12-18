package Recursive;

public class R1 {
    public static void main(String[] args) {

        print(1);

    }

    static void print(int num){

        if(num<=5){

            System.out.println(num);

            print(num+1);
        }

        else{
            return;
        }

    }



}
