package my.exercise.designmode.factory.staticfactory;

/**
 * ***************************************************** 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO  静态工厂相比简单工厂省去了创建工厂对象
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
******************************************************
 */
public class Main {
	public static void main(String[] args) {
		Factory.oneSend().send();
		Factory.secendSend().send();
	}
}
