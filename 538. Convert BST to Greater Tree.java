/*
538. Convert BST to Greater Tree

Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

As a reminder, a binary search tree is a tree that satisfies these constraints:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Note: This question is the same as 1038: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public static ArrayList<Integer> inOrder = new ArrayList<Integer>();
    
	// Stores the sum for last visited node
	public static int lastSum = 0;
	
	// Stores the last visited inorder element
    public static int lastVal = 0;
    
    public TreeNode convertBST(TreeNode root) {
        
        if(root == null){
            return root;
        }

		// Finds the inorder traversal of the tree and returns the greater sum for first inorder node.
        inorderTraverseTree(root);
        
        generateTree(root);
        
		// Cleaning as these are static
        inOrder = new ArrayList<Integer>();
        lastSum = 0;
        lastVal = 0;
        
        return root;
    }
    
	// Actual recursive function
    public static void generateTree(TreeNode root){
        
        if (root == null) {
            return;
        }
        
        generateTree(root.left);
        
		// Get the sum of all inorder successors and replace the node's value
        int greaterSum = lastSum - lastVal;
		
	
        lastVal = root.val; 			// Store this because, for next node, it would lastSum - last visited val
        root.val = greaterSum;
		lastSum = root.val;
        
		
		// Do for next preorder successors
        generateTree(root.right);
    }
    
    // Gets the inorder traversal of the tree
    public static void inorderTraverseTree(TreeNode root){
        
        if (root == null) {
            return;
        }
        
        inorderTraverseTree(root.left);
        inOrder.add(root.val);
        lastSum += root.val;
        inorderTraverseTree(root.right);
        
    }
    
}