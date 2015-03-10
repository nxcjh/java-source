package com.autohome.guava.eventbus.simple;

import com.google.common.eventbus.Subscribe;

/**
 * 消息接收类
 * @author nxcjh
 *
 */
public class EventListener {

	public int lastMessage = 0;
	
	@Subscribe
	public void listen(TestEvent event){
		lastMessage = event.getMessage();
		System.out.println("Message:"+ lastMessage);;
	}
	
	public int getLastMessage(){
		return lastMessage;
	}
	
}
