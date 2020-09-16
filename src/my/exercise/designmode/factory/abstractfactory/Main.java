package my.exercise.designmode.factory.abstractfactory;

/**
 * ***************************************************** 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO 抽象工厂模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，
* 实现Sender接口，同时做一个工厂类，实现Factory接口，就OK了，无需去改动现成的代码。这样做，拓展性较好
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
******************************************************
 */
public class Main {
	public static void main(String[] args) {
		Factory f = new OneFactory();
		f.getSend().send();
		f = new SecendFactory();
		f.getSend().send();
	}
}
