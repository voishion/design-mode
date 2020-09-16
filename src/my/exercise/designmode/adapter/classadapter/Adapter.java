package my.exercise.designmode.adapter.classadapter;

/******************************************************* 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO 类的适配器模式通过继承兼容类实现适配器接口，达到适配目的
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
*******************************************************/
public class Adapter extends Source implements TargetAdapter{

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
		
	}

}
