/*
 * @(#)Test.java 2016年12月11日
 *
 * Copyright (c) 2010 by rayootech.com. All rights reserved.
 */
package my.exercise.designmode.observer2;

/**<p>测试<br/>
 * @className Test.java<br/>
 * @packageName com.stainio.observer<br/>
 * @date 2016年12月11日 下午1:08:58<br/>
 * </p>
 * 
 * @author Li Lu
 * @since 2016年12月11日
 * @version v1.0.0
 */
public class Test {

	public static void main(String[] args) {
		MilkStore ms = new MilkStore();
		
		ms.attach(new Customer("张三"));
		ms.attach(new Customer("李四"));
		ms.attach(new Customer("王五"));
		
		ms.doSendMilk("三鹿奶");
	}

}

