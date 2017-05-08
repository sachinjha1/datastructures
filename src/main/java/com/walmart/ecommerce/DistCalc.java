package com.walmart.ecommerce;

public class DistCalc{
    
    public int findDist(Node root, int n1, int n2){
        
        int x = pathLen(root, n1) - 1;
        int y =pathLen(root, n2) -1;
        
        if(x==-1 || y==-1){
            return 0;
        }
        
        int lcaData = findLCA(root, n1, n2).data;
        int lcaDistance = pathLen(root, lcaData)-1;
        return (x+y) -2 *lcaDistance;
        
        
    }
    
    public int pathLen(Node root, int n1){
        if(root !=null){
            int x=0;
            if((root.data == n1) || (x = pathLen(root.left, n1))>0 
                || (x = pathLen(root.right, n1)) > 0){
                    //System.out.println(root.data);
                    return x+1;
                }
                
                return 0;
        }
        return 0;
    }
    
    public Node findLCA(Node root, int n1, int n2){
        
    if(root !=null){
        
        if(root.data==n1 || root.data==n2){
            return root;
        }
        Node left = findLCA(root.left, n1, n2);
        Node right = findLCA(root.right, n1, n2);
        
        if(left!=null && right !=null){
            return root;
        }
        
        if(left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }
    }
        
        return null;
    }
    
    
}
