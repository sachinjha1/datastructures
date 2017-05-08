package com.walmart.ecommerce;

public class BinaryTree {
    static Node root;
    
    Node constructBST(int arr[], int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node(arr[mid]);
        
        node.left = constructBST(arr, start, mid-1);
        node.right = constructBST(arr, mid+1, end);
        
        return node;
    }
    
    void preOrder(Node node){
        if(node==null){
            return;
        }
        
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    
}
