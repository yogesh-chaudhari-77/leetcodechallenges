/**
 * 485. Max Consecutive Ones
 * 
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * @author Yogeshwar Chaudhari
 * 
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. 
 * The maximum number of consecutive 1s is 3.
 *
 */
 
 class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxLength = 0;
        
        int currLength = 0;
        for(int i = 0; i < nums.length; i++){
            
            // We can start all over again. mark this step
            if(nums[i] == 0){
                
                // We found new max consecutative strings
                if(currLength > maxLength){
                    maxLength = currLength;
                }
                
                currLength = 0;
            }else{
             
                currLength += 1;
                
            }
        }
        
        if(currLength > maxLength){
            maxLength = currLength;
        }
     
        return maxLength;
    }
}