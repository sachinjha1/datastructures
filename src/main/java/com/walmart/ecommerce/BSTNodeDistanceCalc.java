package com.walmart.ecommerce;

import java.util.Arrays;

public class BSTNodeDistanceCalc
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static int bstDistance(int[] values, int n, int node1, int node2)
	{

		// WRITE YOUR CODE HERE
		
		//Sort the input arrays of integers
		Arrays.sort(values);
		
		BinaryTree tree = new BinaryTree();
		//construct binary tree
		tree.root = tree.constructBST(values, 0, n-1);
		//System.out.println("Traversing the tree");
		//print binary tree elements to make sure it tree created correctly
		//tree.preOrder(tree.root);
		
		//Calculate distance between two nodes
		DistCalc dCalc = new DistCalc();
		int distance = dCalc.findDist(tree.root, node1, node2);
		//System.out.println("Distance between entered nodes is "+ distance);
		
		return distance-1;
	}
	// METHOD SIGNATURE ENDS
	
	public static void main(String[] arg){
		//Testcase 1 - bstDistance(new int[]{5,4,3,2,1,6},6,2,5)
		System.out.println("Expecting 3 & getting "+bstDistance(new int[]{5,4,3,2,1,6},6,2,4));
		//Testcase 2 - bstDistance(new int[]{5,4,3,2,1,6},6,1,6)
		System.out.println("Expecting 2 & getting "+bstDistance(new int[]{5,4,3,2,1,6},6,1,6));
		//Testcase 3 - any node not found then return -1
		System.out.println("Expecting -1 & getting "+bstDistance(new int[]{5,4,3,2,1,6},6,1,7));
	}
	
}





