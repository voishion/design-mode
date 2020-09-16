/*
 * @(#)Customer.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2;

/**<p>顾客<br/>
 * @className Customer.java<br/>
 * @packageName com.stainio.observer<br/>
 * @date 2016年12月11日 下午12:57:21<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class Customer implements Observer {

	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void update(String content) {
		System.out.println(String.format("%s喝到了%s...", new Object[]{this.name, content}));
	}

}

