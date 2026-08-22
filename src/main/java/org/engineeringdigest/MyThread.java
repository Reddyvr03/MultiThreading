package org.engineeringdigest;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Thread.sleep(100);
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());
    }
}
