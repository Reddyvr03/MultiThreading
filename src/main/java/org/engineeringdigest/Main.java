package org.engineeringdigest;

/*
Lifecycle of thread
NEW
RUNNABLE
RUNNING ->The thread is in this state when it is executing
BLOCKED/WAITING
TERMINATED
 */
public class Main {
    public static void main(String[] args) {

      Test test = new Test(); // NEW state in thread life cycle
      Thread thread = new Thread(test);
      thread.start();//RUNNABLE state-> After the start method is called, the thread becomes runnable, its ready to run and waiting for cpu time
        for (;;){
            System.out.println("Main");
        }
        }
    }
