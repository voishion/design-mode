package my.exercise.designmode.facade;
/******************************************************* 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  
* TODO 外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的
* 关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，降低了类类之
* 间的耦合度，该模式中没有涉及到接口，看下类图：（我们以一个计算机的启动过程为例）
* 
* 如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，产生关
* 系，这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，这不是我们想要看到的，
* 有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用，这，就是外观模式！
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
*******************************************************/
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		c.start();
		c.stop();
	}

}
