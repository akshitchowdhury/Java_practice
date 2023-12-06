package OOPS2;

public class Circle {
    public static void main(String[] args) {

        Op6 circle = new Op6();

        circle.Op6(10);

        System.out.println("1st area on radius = 10 is "+ circle.area());

        circle.setRadius(30);

        System.out.println("2nd area on radius = 20 is "+ circle.area());
    }
}
