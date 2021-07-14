package com.fc.test;


import com.fc.thread.ThreadCreated;
import com.fc.thread.ThreadRunnable;

import org.junit.Test;

public class ThreadTest {
    @Test
    public void threadTest(){
        ThreadCreated T1 = new ThreadCreated( "Thread-1");
        T1.start();

        ThreadCreated T2 = new ThreadCreated( "Thread-2");
        T2.start();
    }
    @Test
    public void test(){
        ThreadRunnable R1 = new ThreadRunnable( "Thread-1");
        R1.start();

        ThreadRunnable R2 = new ThreadRunnable( "Thread-2");
        R2.start();
    }
    @Test
    public void SleepWaitTest(){
       
    }
}
