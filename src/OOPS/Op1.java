package OOPS;

public class Op1 {
int age;
String name;

    public static void main(String[] args) {
        Op1 mode = new Op1();
        mode.age = 24;
        mode.name = "Mecha";

        int nage = mode.age;
        String alias = mode.name;
        System.out.println(nage );
        System.out.println( alias);
    }
}
