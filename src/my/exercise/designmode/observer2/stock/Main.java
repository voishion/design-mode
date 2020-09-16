/*
 * @(#)Main.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2.stock;

/**<p>测试<br/>
 * @className Main.java<br/>
 * @packageName my.exercise.designmode.observer2.stock<br/>
 * @date 2016年12月11日 下午4:00:12<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class Main {
	public static void main(String[] args) {
		Stock stock = new Stock("苹果", 10.0);
		
		Buyer b1 = new Buyer("Alex", 5.0, 3);
		Buyer b2 = new Buyer("Tom", 6.0, 2);
		
		stock.addObserver(b1);
		stock.addObserver(b2);
		
		for (int i = 0; i < 6; i++) {
			stock.setPrice(stock.getPrice() - 1.5);
		}
	}
}

