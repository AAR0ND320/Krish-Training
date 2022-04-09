package com.aaron.training.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirst {

	Stack<GraphNode> nodeStack = new Stack<>();

	class GraphNode {
		boolean visited;
		int data;
		List<GraphNode> connectedNodes;

		GraphNode(int data) {
			this.data = data;
			this.connectedNodes = new ArrayList<>();
		}
	}

	private GraphNode createNodes() {
		GraphNode node0 = new GraphNode(0);
		GraphNode node1 = new GraphNode(1);
		GraphNode node2 = new GraphNode(2);
		GraphNode node3 = new GraphNode(3);
		GraphNode node4 = new GraphNode(4);
		GraphNode node5 = new GraphNode(5);
		GraphNode node6 = new GraphNode(6);
		GraphNode node7 = new GraphNode(7);

		node0.connectedNodes.add(node3);

		node3.connectedNodes.add(node5);
		node3.connectedNodes.add(node7);
		node3.connectedNodes.add(node0);

		node5.connectedNodes.add(node6);
		node5.connectedNodes.add(node3);

		node6.connectedNodes.add(node2);
		node6.connectedNodes.add(node5);

		node2.connectedNodes.add(node1);
		node2.connectedNodes.add(node6);

		node1.connectedNodes.add(node2);

		node7.connectedNodes.add(node4);

		node4.connectedNodes.add(node7);

		return node0;
	}

	private void traverseNodesRecursion(GraphNode node) {
		if (!node.visited) {
			System.out.print(node.data + ", ");

			node.visited = true;
		}

		for (GraphNode next : node.connectedNodes) {
			if (!next.visited) {
				traverseNodesRecursion(next);
			}
		}
	}

	private void traverseNodesStack(GraphNode node) {
		nodeStack.push(node);

		System.out.print(node.data + ", ");

		node.visited = true;

		for (GraphNode next : node.connectedNodes) {
			if (!next.visited) {
				traverseNodesStack(next);
			}
		}

		nodeStack.pop();
	}

	public void startApp() {
		GraphNode rootNode = createNodes();
		
//		traverseNodesRecursion(rootNode);

		traverseNodesStack(rootNode);
	}

}
