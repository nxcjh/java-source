package com.autohome.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable<String>{

	@Override
	public String call() throws Exception {
		int i;
		for(i=0;i<10000;i++)  
        {  
            System.out.println(i);  
              
        }  
        return String.valueOf(i);  
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableTest t  = new CallableTest();
		FutureTask ft = new FutureTask(t);
		Thread th = new Thread(ft,"子线程");
		th.start();
		System.out.println("结果是"+ft.get());
	}

}
