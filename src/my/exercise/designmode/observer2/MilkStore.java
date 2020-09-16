/*
 * @(#)MilkStore.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2;

/**<p>牛奶店<br/>
 * @className MilkStore.java<br/>
 * @packageName com.stainio.observer<br/>
 * @date 2016年12月11日 下午12:54:55<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class MilkStore extends Subject {
	
	/**
	 * <p>送牛奶<br/>
	 * @title doSendMilk<br/>
	 * @date 2016年12月11日 下午12:56:41<br/>
	 * @author Li Lu<br/>
	 * @since 2016年12月11日
	 * @version v1.0.0
	 * </p>
	 * @param content
	 */
	public void doSendMilk(String content) {
		notifyObservers(content);
	}
}

