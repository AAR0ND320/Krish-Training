package com.aaron.training.articulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Articulation {
	
	private int currentDepth = 1;
	
	private Stack<GraphNode> nodeStack = new Stack<>();

	class GraphNode {
		boolean visited;
		boolean hasBackTrack;

		String data;

		int depthIndex;
		
		GraphNode parent;
		GraphNode backNode;
		List<GraphNode> connectedNodes;

		GraphNode(String data) {
			this.data = data;
			this.connectedNodes = new ArrayList<>();
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

		return nodeA;
	}

	// Uses DFS to find the depth index of each node
	private void initDepthIndex(GraphNode node) {
//		if (!node.visited) {
//			node.visited = true;
//			
//			node.depthIndex = currentDepth++;
//			
//			boolean isAllVisited = true;
//
//			for (GraphNode next : node.connectedNodes) {
//				if (!next.visited) {
//					isAllVisited = false;
//				}
//				
//				if (isAllVisited && node.connectedNodes.size() > 1) {
//					
//				}
//			}
//		}
		
		nodeStack.push(node);
		
		node.depthIndex = currentDepth++;

		node.visited = true;

		for (GraphNode next : node.connectedNodes) {
			if (!next.visited) {
				next.parent = node;
				
				initDepthIndex(next);
			} else {
				if (next.depthIndex < node.depthIndex && next != node.parent) {
					node.hasBackTrack = true;
					
					node.backNode = next;
				}
			}
		}

		nodeStack.pop();

		System.out.println(node.data + " - " + node.depthIndex + ", Has Bactrack? = "
				+ node.hasBackTrack/* + ", Parent = " + node.parent.data */);
	}

	// recursive function to find the lowest index
	// returns integer index
	// only allow one backtrack to be used
	private void findLowIndex(GraphNode node) {
		boolean hasBacktracked = false;
	}

	public void startApp() {
		GraphNode rootNode = createGraph();
		
		initDepthIndex(rootNode);
	}
}
