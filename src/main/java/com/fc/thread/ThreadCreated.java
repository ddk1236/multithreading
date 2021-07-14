package com.fc.thread;

public class ThreadCreated extends Thread {

    private Thread t;
    private String threadName;

    public ThreadCreated(String name) {
        threadName = name;
        System.out.println("初始化线程： " +  threadName );
    }

    public void run() {
        System.out.println("运行线程： " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("启动线程 " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
