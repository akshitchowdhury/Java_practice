package OOPS;

public class Applier extends Extender {

    static int mode(int c, int a, int b){

        int result = c+Extender.prototype(a,b);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mode(10,12,13));
    }
}
