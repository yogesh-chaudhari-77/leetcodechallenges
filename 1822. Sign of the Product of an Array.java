/* 
1822. Sign of the Product of an Array
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

*/

class Solution {
    
    public int arraySign(int[] nums) {
        
        int product = signFunc(nums[0]);
        
        for(int i = 1; i < nums.length; i++){
            
            product = product * signFunc(nums[i]);
        }
        
        return signFunc(product);
    }
    
    public int signFunc(int product){
        
        if(product > 0){
            return 1;
        }else if (product < 0){
            return -1;
        }else {
            return 0;
        }
        
    }
}
