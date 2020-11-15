/*
268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

*/
class Solution {
    
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        
//        for(int i = 0; i < n; i++){
//            
//            int diff = n - nums[i];
//            
//            if(diff != n && nums[diff] != diff){
//                return diff;
//            }else if(diff == n ) {
//            	if(nums[diff-1] != n) {
//            		return n;
//            	}
//            }
//            
//        }
    
        if( n >= 2) {
        	for(int i = 0; i < n-1; i++){

            	if(nums[i+1] != nums[i] + 1){
            		return nums[i] + 1;
            	}
            }	
        }
        
        if(nums[0] != 0) {
        	return 0;
        }
        
        return n;

    }
}