/*
1299. Replace Elements with Greatest Element on Right Side

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]

*/

class Solution {
    
    public int[] replaceElements(int[] arr) {
        
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        for(int a : arr){
            arrL.add(a);
        }
        
        for(int i = 0; i < (arr.length)-1; i++){
            
            int current_element = arr[i];
            arrL.remove(0);
            int max_from_right = Collections.max(arrL);
            arr[i] = max_from_right;
        }
        
        arr[(arr.length - 1)] = -1;
        
        return arr;
    }
    
}