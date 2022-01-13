package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {
    public void run() {
        printCurrentTime();
    }
    public void printCurrentTime() {        
        for(int loop=0; loop<10; loop++) {
            try {
                long time = System.currentTimeMillis();
                Date date = new Date(time);
                time -= time % 1000;
                System.out.println(date+" "+time);
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
