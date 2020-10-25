/*
1038. Binary Search Tree to Greater Sum Tree

Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

As a reminder, a binary search tree is a tree that satisfies these constraints:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Note: This question is the same as 538: https://leetcode.com/problems/convert-bst-to-greater-tree/

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
    
    public static ArrayList<Integer> preOrder = new ArrayList<Integer>();
    public static ArrayList<Integer> inOrder = new ArrayList<Integer>();
    
    
    public TreeNode bstToGst(TreeNode root) {
        
        if(root == null){
            return root;
        }
        
        //preorderTraverseTree(root);
        inorderTraverseTree(root);
        
        generateTree(root);
        
        preOrder = new ArrayList<Integer>();
        inOrder = new ArrayList<Integer>();
        
        return root;
    }
    
	// Actual recursive function
    public static void generateTree(TreeNode root){
        
        if (root == null) {
            return;
        }
        
		// Get the sum of all inorder successors and replace the node's value
        root.val = sumInorderNodes(root.val);
		// Do for next preorder successors
        generateTree(root.left);
        generateTree(root.right);
    }
    
    // Gets the preorder traversal of the tree
    public static void preorderTraverseTree(TreeNode root){
        
        if (root == null) {
            return;
        }
        preOrder.add(root.val);
        preorderTraverseTree(root.left);
        preorderTraverseTree(root.right);
        
    }
    
    // Gets the inorder traversal of the tree
    public static void inorderTraverseTree(TreeNode root){
        
        if (root == null) {
            return;
        }
        
        inorderTraverseTree(root.left);
        inOrder.add(root.val);
        inorderTraverseTree(root.right);
        
    }
    
    // Gets the sum of inorder successors
    public static int sumInorderNodes(int nodeVal){
        
        int index = inOrder.indexOf(nodeVal);
        int inOrderSum = 0;
        
        for(int i = index; i < inOrder.size(); i++){
            inOrderSum += inOrder.get(i);
            System.out.print(inOrder.get(i)+" ");
        }
        
        System.out.print("\n");
        
        return inOrderSum;
    }
}