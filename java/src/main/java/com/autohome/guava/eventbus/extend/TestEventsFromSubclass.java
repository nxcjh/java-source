package com.autohome.guava.eventbus.extend;

import com.google.common.eventbus.EventBus;

/**
 * 说明：在这个方法中,我们看到第一个事件(新的整数(100))是收到两个听众
 * ,但第二个(新长(200 l))只能到达NumberListener作为整数一不是
 * 创建这种类型的事件。可以使用此功能来创建更通用的监听器监听一个广泛的事
 * 件和更详细的具体的特殊的事件。
 * @author nxcjh
 *
 */
public class TestEventsFromSubclass {

	public static void main(String[] args) {
		EventBus eventBus = new EventBus("test");
		IntegerListener integerListener = new IntegerListener();
		NumberListener numberListener = new NumberListener();
		eventBus.register(integerListener);
		eventBus.register(numberListener);
		
		eventBus.post(new Integer(100));
		System.out.println("integerListener messages:"+integerListener.getLastMessage());
		System.out.println("numberListener message:"+numberListener.getLastMessage());
		
		eventBus.post(new Long(200L));  
	       
        System.out.println("integerListener message:"+integerListener.getLastMessage());
        System.out.println("numberListener message:"+numberListener.getLastMessage());   
	}
	
}
