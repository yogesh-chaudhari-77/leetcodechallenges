/**
349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
**/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        ArrayList<Integer> nums1_list = new ArrayList<Integer>();
        ArrayList<Integer> nums2_list = new ArrayList<Integer>();
        
        for(int i : nums1){
            nums1_list.add(i);
        }
        
        for(int i : nums2){
            nums2_list.add(i);
        }
        
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        
        for(int i : nums1_list){
            if(nums2_list.contains(i)){
                if(intersection.contains(i) == false){
                    intersection.add(i);
                }else{
                    continue;
                }
            }
        }
        
        int [] ret = new int [intersection.size()];
        for(int i = 0; i < intersection.size(); i++){
            ret[i] = intersection.get(i);
        }
        
        
        return ret;
    }
}