package OOPS2;

public class Op5 {
    private int length;
    private int breadth;

    public void Op5(int length, int breadth){

        this.length = length;
        this.breadth= breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }

    public int Area(){
        getBreadth();
        getLength();
        return length*breadth;

    }

    public int Perimeter(){
        getLength();
        getBreadth();
        return 2*(length+breadth);
    }
}
