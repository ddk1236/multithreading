package com.fc.thread;

public class SleepWait extends Thread{
    public static void main(String[] args) throws InterruptedException {
        thread b = new thread("B");
        b.start();
        thread a = new thread("A");
        a.start();
        a.join();
        thread c = new thread("C");
        c.start();



    }
}
class thread extends Thread{
    private String threadName;

    public thread(String threadName){
        this.threadName = threadName;
        System.out.println("创建线程:"+threadName);
    }

    public thread() {

    }

    @Override
    public void run() {
        System.out.println("启动线程");
        try {
            for (int i = 0;i<100;i++){
                System.out.println("运行线程:"+threadName+i);
            }
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}