package Threads;

public class Thread_drive {
    public static void main(String[] args) {

        Thread t1 = new Thread(String.valueOf(new Sample_thread("Thread1")));
        Thread t2 = new Thread(String.valueOf(new Sample_thread("Thread2")));
        Thread t3 = new Thread(String.valueOf(new Sample_thread("Thread3")));


//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority()) ;


        t1.setPriority(6);
        t2.setPriority(9);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();

//
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t3.getPriority()) ;


    }
}
