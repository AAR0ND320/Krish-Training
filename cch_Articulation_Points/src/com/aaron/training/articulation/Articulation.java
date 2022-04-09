package com.aaron.training.articulation;

import java.util.ArrayList;
import java.util.List;

public class Articulation {

	class GraphNode {
		boolean visited;
		boolean isBackTrack;
		
		String data;
		
		int depthIndex;
		
		List<GraphNode> connectedNodes;
		
		GraphNode(String data) {
			this.data = data;
			this.connectedNodes = new ArrayList<>();
		}
	}
	
	private void createGraph() {
		
	}
	
	// recursive function to find the lowest index
	// returns int index
	
}
