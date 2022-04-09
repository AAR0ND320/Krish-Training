package com.aaron.training.articulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Articulation {

	private int currentDepth = 1;

	private Stack<GraphNode> nodeStack = new Stack<>();
	private List<GraphNode> nodeList = new ArrayList<>();

	class GraphNode {
		boolean visited;
		boolean hasBackTrack;

		String data;

		int depthIndex;
		int lowIndex;

		GraphNode parent;
		GraphNode backNode;
		List<GraphNode> connectedNodes;
		List<GraphNode> childNodes;

		GraphNode(String data) {
			this.data = data;
			this.connectedNodes = new ArrayList<>();
			this.childNodes = new ArrayList<>();
		}
	}

	private GraphNode createGraph() {
		// ABCDEFGHI
		GraphNode nodeA = new GraphNode("A");
		GraphNode nodeB = new GraphNode("B");
		GraphNode nodeC = new GraphNode("C");
		GraphNode nodeD = new GraphNode("D");
		GraphNode nodeE = new GraphNode("E");
		GraphNode nodeF = new GraphNode("F");
		GraphNode nodeG = new GraphNode("G");
		GraphNode nodeH = new GraphNode("H");
		GraphNode nodeI = new GraphNode("I");

		nodeA.connectedNodes.add(nodeB);
		nodeA.connectedNodes.add(nodeD);

		nodeB.connectedNodes.add(nodeC);
		nodeB.connectedNodes.add(nodeA);

		nodeC.connectedNodes.add(nodeD);
		nodeC.connectedNodes.add(nodeB);
		nodeC.connectedNodes.add(nodeE);
		nodeC.connectedNodes.add(nodeF);

		nodeD.connectedNodes.add(nodeC);
		nodeD.connectedNodes.add(nodeA);

		nodeE.connectedNodes.add(nodeC);
		nodeE.connectedNodes.add(nodeF);

		nodeF.connectedNodes.add(nodeC);
		nodeF.connectedNodes.add(nodeE);
		nodeF.connectedNodes.add(nodeG);

		nodeG.connectedNodes.add(nodeF);
		nodeG.connectedNodes.add(nodeH);
		nodeG.connectedNodes.add(nodeI);

		nodeH.connectedNodes.add(nodeG);
		nodeH.connectedNodes.add(nodeI);

		nodeI.connectedNodes.add(nodeG);
		nodeI.connectedNodes.add(nodeH);

		nodeList.add(nodeA);
		nodeList.add(nodeB);
		nodeList.add(nodeC);
		nodeList.add(nodeD);
		nodeList.add(nodeE);
		nodeList.add(nodeF);
		nodeList.add(nodeG);
		nodeList.add(nodeH);
		nodeList.add(nodeI);

		return nodeA;
	}

	// Uses DFS to find the depth index of each node
	private void initDepthIndex(GraphNode node) {
		nodeStack.push(node);

		node.depthIndex = currentDepth++;

		node.visited = true;

		for (GraphNode next : node.connectedNodes) {
			if (!next.visited) {
				next.parent = node;
				node.childNodes.add(next);

				initDepthIndex(next);
			} else {
				if (next.depthIndex < node.depthIndex && next != node.parent) {
					node.hasBackTrack = true;

					node.backNode = next;
				}
			}
		}

		nodeStack.pop();
	}

	// recursive function to find the lowest index
	// returns integer index
	// only allow one backtrack to be used
	private int findLowIndex(GraphNode node) {
		if (node.depthIndex == 1) {
			return 1;
		} else {
			if (node.backNode != null) {
				return node.backNode.depthIndex;
			}

			int lowestIndex = currentDepth;

			for (GraphNode next : node.childNodes) {
				int index = findLowIndex(next);

				if (index < lowestIndex) {
					lowestIndex = index;
				}

				if (lowestIndex <= node.depthIndex) {
					return lowestIndex;
				}
			}

			return lowestIndex;
		}
	}

	public void startApp() {
		GraphNode rootNode = createGraph();

		initDepthIndex(rootNode);

		for (GraphNode node : nodeList) {
			node.lowIndex = findLowIndex(node);
		}

		System.out.println(":::: Articulation Points ::::");

		for (GraphNode node : nodeList) {
			if (node.parent != null) {
				for (GraphNode child : node.childNodes) {
					if (child.lowIndex >= node.depthIndex) {
						System.out.println(node.data);
						
						break;
					}
				}
			}
		}
	}
}
