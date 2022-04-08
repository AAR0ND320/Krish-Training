package com.aaron.training.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
	
	Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
	
	class TreeNode {
		boolean visited;
		String data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(String data) {
			this.data = data;
		}
	}

	private TreeNode createTree() {
		TreeNode nodeA = new TreeNode("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		TreeNode nodeD = new TreeNode("D");
		TreeNode nodeE = new TreeNode("E");
		TreeNode nodeF = new TreeNode("F");
		TreeNode nodeG = new TreeNode("G");
		
		nodeA.right = nodeB;
		nodeA.left = nodeC;
		
		nodeB.right= nodeD;
		
		nodeC.right = nodeE;
		nodeC.left = nodeG;
		
		nodeE.right = nodeF;
		
		return nodeA;
	}
	
	public void startApp() {
		nodeQueue.add(createTree());
		
		traverseTree(nodeQueue.remove());
	}
	
	private void traverseTree(TreeNode node) {
		if (node == null) {
			return;
		}
		
		node.visited = true;
		System.out.println(node.data);
		
		if (node.right != null) {
			nodeQueue.add(node.right);
		}
		
		if (node.left != null) {
			nodeQueue.add(node.left);
		}
		
		traverseTree(nodeQueue.poll());
	}
	
}
