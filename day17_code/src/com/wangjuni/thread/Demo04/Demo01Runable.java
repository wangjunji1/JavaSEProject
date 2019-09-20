package com.wangjuni.thread.Demo04;

import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

public class Demo01Runable {
    public static void main(String[] args) {
        RunnableImp1 r1 = new RunnableImp1();
       new Thread(r1).start();
    }

}
