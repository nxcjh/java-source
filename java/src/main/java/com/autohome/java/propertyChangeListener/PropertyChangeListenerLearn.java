package com.autohome.java.propertyChangeListener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * PropertyChangenLinstener可以监听属性bean值的改变, 应用Observer模式, 进行一些操作
 * @author nxcjh
 *
 */
/**
 * 所要监听的bean的基类
 * @author nxcjh
 *
 */
public class PropertyChangeListenerLearn {

	PropertyChangeSupport listeners = new PropertyChangeSupport(this);
	
	public void addPropertyChangeListener(PropertyChangeListener listener){
		listeners.addPropertyChangeListener(listener);
	}
	
	public void firePropertyChange(String prop,Object oldValue, Object newValue){
		listeners.firePropertyChange(prop, oldValue, newValue);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener l) {  
        listeners.removePropertyChangeListener(l);  
    }  
	
}
