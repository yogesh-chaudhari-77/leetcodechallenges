/*
217. Contains Duplicate
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Sort the elements in an array. This would arrange duplicate elements one after another
        Arrays.sort(nums);
        
        
        // empty or 1 element array cant have duplicates
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        
       // Iterate over array to check if any 2 consecutive elements are same. if yes that means there are duplicates
        
        try{
        
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == nums[i+1]){
                    return true;
                }
            }
            
        }catch(ArrayIndexOutOfBoundsException ae){
            // This will occure for the last element
        }
        
        
        return false;
    }
}