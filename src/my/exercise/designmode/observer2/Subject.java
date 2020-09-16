/*
 * @(#)Subject.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2;

import java.util.ArrayList;
import java.util.Collection;

/**<p>观察主题<br/>
 * @className Subject.java<br/>
 * @packageName com.stainio.observer<br/>
 * @date 2016年12月11日 下午12:46:35<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public abstract class Subject {
	private Collection<Observer> observer = new ArrayList<Observer>();
	
	/**
	 * <p>附加观察者<br/>
	 * @title attach<br/>
	 * @date 2016年12月11日 下午12:51:20<br/>
	 * @author Li Lu<br/>
	 * @since 2016年12月11日
	 * @version v1.0.0
	 * </p>
	 * @param observer
	 */
	public void attach(Observer observer) {
		this.observer.add(observer);
	}
	/**
	 * <p><br/>
	 * @title 取缔观察者<br/>
	 * @date 2016年12月11日 下午12:51:39<br/>
	 * @author Li Lu<br/>
	 * @since 2016年12月11日
	 * @version v1.0.0
	 * </p>
	 * @param observer
	 */
	public void dettach(Observer observer) {
		this.observer.remove(observer);
	}
	
	/**
	 * <p>通知所有观察者<br/>
	 * @title notifyObservers<br/>
	 * @date 2016年12月11日 下午12:53:15<br/>
	 * @author Li Lu<br/>
	 * @since 2016年12月11日
	 * @version v1.0.0
	 * </p>
	 * @param content
	 */
	public void notifyObservers(String content) {
		for (Observer ob : observer) {
			ob.update(content);
		}
	}
}

