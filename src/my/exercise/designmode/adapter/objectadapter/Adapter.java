package my.exercise.designmode.adapter.objectadapter;

/******************************************************* 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO 对象适配器模式通过兼容类对象实现适配器接口，达到适配目的
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
*******************************************************/
public class Adapter implements TargetAdapter{
	private Source source;

	
	
	public Adapter(Source source) {
		this.source = source;
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
		
	}

	@Override
	public void method1() {
		source.method1();
		
	}

}
