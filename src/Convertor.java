import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please give an input");

        int in1 = sc.nextInt();

        if(in1>0){
            System.out.println(true);
        }

        else{
            System.out.println(false);
        }
    }
}
