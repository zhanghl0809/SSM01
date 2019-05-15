package test;

public class MyThread01 implements Runnable {

    public MyThread01(){

    }
    public static void main(String[] args) {

        new Thread("thread01").start();
        new Thread("thread02").start();
    }
    public void run() {
        System.out.println();
    }
}
