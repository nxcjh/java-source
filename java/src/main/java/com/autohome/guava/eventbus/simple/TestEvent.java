package com.autohome.guava.eventbus.simple;

/**
 * 消息封装类
 * @author nxcjh
 *
 */
public class TestEvent {

	private final int message;
	public TestEvent(int message){
		this.message = message;
		System.out.println("event message:"+message);
	}
	public int getMessage(){
		return message;
	}
}
