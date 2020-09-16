package my.exercise.designmode.builder;

import java.util.ArrayList;
import java.util.List;

import my.exercise.designmode.factory.abstractfactory.OneFactory;
import my.exercise.designmode.factory.abstractfactory.SecendSend;
import my.exercise.designmode.factory.abstractfactory.Send;

/******************************************************* 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
* 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象
* 工厂模式和最后的Main结合起来的。
* 当然对建造者模式还可以进行抽象化改造。
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
******************************************************/
public class Builder {

	private List<Send> list = new ArrayList<Send>();
	
	public void oneSend(int count){
		for(int i=0; i<count; i++){
			list.add((new OneFactory()).getSend());
		}
	}
	
	public void secendSend(int count){
		for(int i=0; i<count; i++){
			list.add(new SecendSend());
		}
	}

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.oneSend(10);
	}
}
