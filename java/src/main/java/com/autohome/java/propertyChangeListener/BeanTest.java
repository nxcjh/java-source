package com.autohome.java.propertyChangeListener;

/**
 * 继承基类所实现的具体bean, 在set方法中设置属性监听器的触发fire方法
 * @author nxcjh
 *
 */
public class BeanTest extends PropertyChangeListenerLearn{
	
	static final String TEST = "TEST";
	
	private String name = "";
	
	public void setName(String name){
		if(this.name.equals(name)){
			System.out.println("BeanTest的name属性没有变化!");
			return;
		}
		String oldName = this.name;
		this.name = name;
		firePropertyChange(TEST, oldName, name);
	}
	
	public String getName(){
		return name;
	}

}
