package com.autohome.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecutorService {

	public static void main(String[] args) {
		ScheduledExecutorService execService =   Executors.newScheduledThreadPool(3);
		
		execService.scheduleAtFixedRate(new Runnable(){

			@Override
			public void run() {
				System.out.println("任务:"+ Thread.currentThread().getName()+"执行了, 时间为:"
						+System.currentTimeMillis());
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}, 5, 2, TimeUnit.SECONDS);
		
		execService.scheduleWithFixedDelay(new Runnable(){

			@Override
			public void run() {
				System.out.println("任务："+Thread.currentThread().getName()+"执行了，时间为："+System.currentTimeMillis());
				 try {  
	                    Thread.sleep(1000L);  
	                } catch (Exception e) {  
	                    e.printStackTrace();  
	                }  
			}
			
		}, 5, 2, TimeUnit.SECONDS);
		try {
			Thread.sleep(10000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        execService.shutdown();  
	}
}
