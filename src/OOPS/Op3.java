package OOPS;

public class Op3 {

    private int n1;
    private int n2;

    public void Op3(int n1, int n2){

        this.n1 = n1;
        this.n2 = n2;
    }

    public int getn1(){
        return n1;
    }

    public int getn2(){
        return n2;
    }

    public int add(){
        return n1+n2;
    }
}
