/*
 * @(#)Observer.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2;

/**<p>观察者<br/>
 * @className Observer.java<br/>
 * @packageName com.stainio.observer<br/>
 * @date 2016年12月11日 下午12:48:45<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public interface Observer {

	/**
	 * <p>接收通知<br/>
	 * @title update<br/>
	 * @date 2016年12月11日 下午12:53:49<br/>
	 * @author Li Lu<br/>
	 * @since 2016年12月11日
	 * @version v1.0.0
	 * </p>
	 * @param content
	 */
	public void update(String content);

}

