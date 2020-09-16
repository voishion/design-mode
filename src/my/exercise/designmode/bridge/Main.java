package my.exercise.designmode.bridge;
/******************************************************* 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：
* 将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，
* JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝
* 毫不用动，原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
*******************************************************/
public class Main {

	public static void main(String[] args) {
		/*调用第一个对象*/
		Sourceable source1 = new SourceSub1();
		/*调用第二个对象*/
		Sourceable source2 = new SourceSub2();
		MyBridge bridge = new MyBridge();
		bridge.setSource(source1);
		bridge.method();
		bridge.setSource(source2);
		bridge.method();

	}

}
