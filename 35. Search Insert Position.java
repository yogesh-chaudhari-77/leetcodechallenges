/*
35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 7
Output: 4

*/
class Solution {
    
    public int searchInsert(int[] nums, int target) {
        
        // Using binary array split to reduce the problem size
        int arrLength = nums.length;
        int mid = arrLength / 2;
        int index = -1;
        
        if(target < nums[ mid ]){
            index = searchInHalf(nums, 0, mid, target);
        }else{
            index = searchInHalf(nums, mid, arrLength, target);
        }
        
        return index;
    }
    
    
    // Finds the element sequencially from given start
    public int searchInHalf(int[] nums, int start, int end, int target){
        
        for(int i = start; i < end; i++){
            if(nums[i] == target || nums[i] > target){
                return i;
            }
        }
        
        return end;
    }
    
}