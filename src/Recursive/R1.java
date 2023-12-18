package Recursive;

public class R1 {
    public static void main(String[] args) {

        print(1);

    }

    static void print(int num){
        System.out.println(num);

        print2(num+1);
    }

    static void print2(int num){
        System.out.println(num);
        print3(num+1);

    }


    static void print3(int num){
        System.out.println(num);
        print4(num+1);
    }

    static void print4(int num){
        System.out.println(num);
        print5(num+1);
    }



    static void print5(int num){
        System.out.println(num);
        print6(num+1);
    }


    static void print6(int num){
        System.out.println(num);
    }

}
