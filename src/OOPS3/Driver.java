package OOPS3;

public class Driver {
    public static void main(String[] args) {

//        Applier apply = new Applier();
//
//        System.out.println(apply.addition(12,10));
//        System.out.println(apply.multiplication(2,10));

    Store st = new Store();

        System.out.println(st.records(20,23));
        System.out.println(st.addelem(st.records(20,23)));

    }
}
