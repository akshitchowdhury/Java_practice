package OOPS2;

public class Op6 {

    private int radius;

    public void Op6(int radius){

        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public double area(){
        getRadius();

        double area = 3.14* getRadius()*getRadius();
        return area;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
