package com.autohome.guava.eventbus.multiple;

import com.google.common.eventbus.EventBus;

public class TestMultipleEvents {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus("test");
		MultipleListener multiListener = new MultipleListener();
		eventBus.register(multiListener);
		
		eventBus.post(new Integer(100));
		eventBus.post(new Integer(200));
		eventBus.post(new Integer(300));
		eventBus.post(new Long(30098));
		eventBus.post(new Long(32452352));
		System.out.println("LastInteger:"+multiListener.getLastInteger());;
		System.out.println("LastLong:"+multiListener.getLastLong());;
	}
}
