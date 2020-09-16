/*
 * @(#)Stock.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2.stock;

import java.util.Observable;

/**<p>股票对象<br/>
 * @className Stock.java<br/>
 * @packageName my.exercise.designmode.observer2.stock<br/>
 * @date 2016年12月11日 下午3:43:32<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class Stock extends Observable{
	
	private String name;
	private double price;
	
	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		this.setChanged();
		this.notifyObservers(price);
	}
}

