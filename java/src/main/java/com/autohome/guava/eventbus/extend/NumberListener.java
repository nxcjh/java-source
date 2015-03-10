package com.autohome.guava.eventbus.extend;

import com.google.common.eventbus.Subscribe;

/**
 * 如果ListenerA 监听EventA, 而EventA 有一个子类EventB, 此时Listener A
 * 将同时接收EventA和B消息.
 * @author nxcjh
 *
 */
public class NumberListener {
	private Number lastMessage;  
	   
    @Subscribe  
    public void listen(Number integer) {  
        lastMessage = integer; 
        System.out.println("Message:"+lastMessage);
    }  
   
    public Number getLastMessage() {  
        return lastMessage;  
    }  
}
