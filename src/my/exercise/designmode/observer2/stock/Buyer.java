/*
 * @(#)Buyer.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2.stock;

import java.util.Observable;
import java.util.Observer;

/**<p>买家<br/>
 * @className Buyer.java<br/>
 * @packageName my.exercise.designmode.observer2.stock<br/>
 * @date 2016年12月11日 下午3:46:11<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class Buyer implements Observer{
	// 买家名称
	private String name;
	// 每股价格
	private double price;
	// 计划买入总数
	private int count;
	
	public Buyer(String name, double price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public void update(Observable o, Object arg) {
		if ((Double)arg > this.price) {
			// 还未到达目标价格
			System.out.println(name + ":还没有到价位，进行观望！");
			return;
		} 
		count--;
		System.out.println(name + ":买入股票，现在还需要再买" + count + "股！");
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

