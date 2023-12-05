package OOPS2;

public class Rectangle {
    public static void main(String[] args) {
        Op5 drive = new Op5();

        drive.Op5(10,20);

        int res = drive.Area();
        int p_res = drive.Perimeter();

        System.out.println(res+ " "+ p_res );
    }
}
