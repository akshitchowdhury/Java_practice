package OOPS3;

public class Applier implements Prototype {
    @Override
    public int addition(int n1, int n2) {

        int result = n1+n2;
        return result;
    }

    @Override
    public int multiplication(int a, int b) {
        int res = a*b;
        return res;
    }
}
