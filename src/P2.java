import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1st number : ");
        int n1 = sc.nextInt();

        System.out.println("2nd number : ");
        int n2 = sc.nextInt();

        System.out.println("3rd number : ");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println(n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println(n2);
        }  else if  (n3>n1 && n3>n2) {
            System.out.println(n3);
        }
    }
}
