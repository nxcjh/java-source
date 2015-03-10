package com.autohome.guava.eventbus.simple;

import com.google.common.eventbus.EventBus;

/**
 * 测试类及输出结果
 * @author nxcjh
 *
 */
public class TestEventBus {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus("test");
		EventListener listener = new EventListener();
		eventBus.register(listener);
		eventBus.post(new TestEvent(200));
		eventBus.post(new TestEvent(300));
		eventBus.post(new TestEvent(400));
		System.out.println("LastMessage:"+listener.getLastMessage());
		
	}
}
