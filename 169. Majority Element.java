/**
 * 169. Majority Element
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * @author Yogeshwar Chaudhari
 * 
 * Input: [3,2,3] Output: 3
 * Input: [2,2,1,1,1,2,2] Output: 2
 *
 */
 
 class Solution {
    
	public int majorityElement(int[] nums) {
	
		// Sort the array - since the majority element will appear at the n/2 position always
		Arrays.sort(nums);
		return (nums[nums.length/2]);
    }
}