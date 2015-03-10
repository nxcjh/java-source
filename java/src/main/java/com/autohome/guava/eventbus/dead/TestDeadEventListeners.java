package com.autohome.guava.eventbus.dead;

import com.autohome.guava.eventbus.simple.TestEvent;
import com.google.common.eventbus.EventBus;

public class TestDeadEventListeners {

/**
 * 说明：如果没有消息订阅者监听消息， EventBus将发送DeadEvent消息，这时我们可以通过log的方式来记录这种状态。	
 * @param args
 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus("test");
		DeadEventListener listener = new DeadEventListener();
		eventBus.register(listener);
		eventBus.post(new TestEvent(300));
		eventBus.post(new TestEvent(400));
		System.out.println("deadEvent:"+listener.isNotDelivered());
	}
}
