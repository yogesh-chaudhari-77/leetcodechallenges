/**
350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
**/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> nums1_list = new ArrayList<Integer>();
        ArrayList<Integer> nums2_list = new ArrayList<Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        
        for(int i : nums1){
            nums1_list.add(i);
        }
        
        for(int i : nums2){
            nums2_list.add(i);
        }
        
        for(int a : nums1_list){
            
            if(nums2_list.contains(a)){
                
                intersection.add(a);
                nums2_list.remove(new Integer(a));
                
            }
            
        }
        
        int [] ret = new int [intersection.size()];
        for(int i = 0; i < intersection.size(); i++){
            ret[i] = intersection.get(i);
        }
        
        return ret;
    }
}