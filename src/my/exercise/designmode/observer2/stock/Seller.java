/*
 * @(#)Seller.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2.stock;

import java.util.Observable;
import java.util.Observer;

/**<p>卖家<br/>
 * @className Seller.java<br/>
 * @packageName my.exercise.designmode.observer2.stock<br/>
 * @date 2016年12月11日 下午3:46:19<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class Seller implements Observer{
	// 卖家名称
	private String name;
	// 每股价格
	private double price;
	// 计划售出总数
	private int count;
	
	public Seller(String name, double price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public void update(Observable o, Object arg) {
		if ((Double)arg < this.price) {
			// 还未到达目标价格
			System.out.println(name + ":还没到出手的时候！");
			return;
		}
		count--;
		System.out.println(name + ":卖出自己的股票，现在还有" + count + "股");
		if (count == 0) {
			o.deleteObserver(this);
		}
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}
}

