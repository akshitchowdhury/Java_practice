package Threads;

public class Sample_thread implements Runnable {

private String name;
Sample_thread(String name){
    this.name = name;
}
    @Override
    public void run() {
        System.out.println("The run for the Threads..." + name);
    }
}
