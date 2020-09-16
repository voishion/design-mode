package my.exercise.designmode.composite;

/******************************************************* 
* Copyright (C) 2014 iQIYI.COM - All Rights Reserved
*
* This file is part of MA-2.0
* Unauthorized copy of this file, via any medium is strictly prohibited. 
* Proprietary and Confidential. 
*  组合模式
* TODO 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
*  
* Author(s): xiaoxiliang <xiaoxiliang@qiyi.com> 
*  
*******************************************************/
public class Tree {

	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		nodeC.setParent(nodeB);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!"+tree.root.getChildren().nextElement());
	}
}
