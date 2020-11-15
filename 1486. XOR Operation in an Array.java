/*
1486. XOR Operation in an Array

Given an integer n and an integer start.
Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
Return the bitwise XOR of all elements of nums.

*/
class Solution {
    public int xorOperation(int n, int start) {
        
        int [] arr = new int [n];
        
        // Creating an array from n and start
        for(int i = 0; i < n; i++){
            arr[i] = start + 2*i;
        }
        
        // Performing bitwise XOR operation
        int result = arr[0];
        
        for(int j = 1; j < arr.length; j++){
            result = result ^ arr[j];
        }
        
        return result;
    }
}