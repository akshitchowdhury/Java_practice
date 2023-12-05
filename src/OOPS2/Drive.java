package OOPS2;

public class Drive {
    public static void main(String[] args) {


        Op4 ops = new Op4();

        ops.Op4("Glenno", "Loacal");

        System.out.println("Originally default name " + ops.getName() + ops.getBreed());

   String neo =  ops.setName("Gullu");
    String neoAlias= ops.setBreed("Hound");
        System.out.println("New name set "+ neo + neoAlias);
    }

}
