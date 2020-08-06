/*
All test cases passed but time limit exceeded
219. Contains Duplicate II
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true

Input: nums = [1,0,1,1], k = 1
Output: true

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

class Solution {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        

        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        
        try{
        
            // Iterate over array and check i+kth element to find there exisits such pair
            for(int i = 0, numsLen = nums.length; i < numsLen ; i++ ){
                for(int j = i+1; j <= i+k; j++){
                    if (j < numsLen){
                        if(nums[i] == nums[j]){
                            return true;
                        }
                    }   
                } 
            }
            
        }catch(ArrayIndexOutOfBoundsException a){
            // This might occure if k is too long
        }
        
        return false;
    }
}