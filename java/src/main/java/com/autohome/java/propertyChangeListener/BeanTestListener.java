package com.autohome.java.propertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 自定义监听器
 * @author nxcjh
 *
 */
public class BeanTestListener implements PropertyChangeListener{

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals(BeanTest.TEST));
		 System.out.println("I need do something, what is the something");  
	}
	
	public static void main(String[] args) {
		BeanTest test = new BeanTest();
		test.addPropertyChangeListener(new BeanTestListener());
		System.out.println(test.getName());
		test.setName("dirk.name");
		System.out.println(test.getName());
		test.setName("dirk.zhangzhang");
		System.out.println(test.getName());
	}

	
}
