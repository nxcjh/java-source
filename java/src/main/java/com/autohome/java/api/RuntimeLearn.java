package com.autohome.java.api;

import java.io.IOException;
/**简介: 
 *  Runtime(运行时):是一个封装了JVM进程的类.每运行一个JAVA程序实际上 
 *  都是启动了一个JVM进程,而每一个JVM进程都是对应这一个Runtime实例,此 
 *  实例是由JVM实例化的.在整个JVM中只存在一个Runtime类的对象. 
 *   
 *  在Runtime类的定义中没有构造方法,因为其构造方法被私有化了,即被设计 
 *  成单例模式了,那么在此类中必然有一个静态方法可以返回本类的实例化对象. 
 *   
 *  public static Runtime getRuntime(); 
 */  
  
  
//每一个Runtime对象都是由JVM进行实例化的  
//所以可以直接通过此类取得JVM的一些信息 
public class RuntimeLearn {

	public static void runTimeTest1(){
		
		//通过runtime类的静态方法进行实例化
		Runtime run = Runtime.getRuntime();
		//取得JVM的最大内存量, 根据机器不同而不同
		System.out.println("JVM最大内存"+run.maxMemory());
		
		//取得程序运行的空闲内存
		System.out.println("JVM空闲内存"+run.freeMemory());
		
		//以下验证使用String操作字符串(增删改查)容易降低性能
		String str = "Hello"+"world"+"!"+"Welcome to"+"China.";
		System.out.println(str);
		
		for(int i=0;i<1000;i++){  
            str+=i; //循环修改内容,会产生很多内容  
        }  
		long size1 =  run.freeMemory(); 
        System.out.println("操作String之后,JVM空闲内存:"+size1);
        
        
        //进行垃圾收集, 释放空间
        run.gc();
        long size2 =  run.freeMemory(); 
        System.out.println("进行垃圾回收之后,JVM空闲内存:"+size2);  
        System.out.println(size2-size1); 
	}
	
	
	/**
	 * 可以直接使用Runtime类运行本机的可执行程序
	 * //打开一个记事本, 五秒后自动关闭
	 */
	public static void runProject(){
		
		//取得Runtime类的实例化对象
		Runtime run = Runtime.getRuntime();
		
		//定义进程变量
		Process p = null;
		int a = 10;
		try {
			//调用笔记记事本程序
			p = run.exec("notepad.exe");
			Thread.sleep(5000);//让此线程存活5秒
//			p.destroy();//结束此进程
			a = p.waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		runProject();
	}
		
}
