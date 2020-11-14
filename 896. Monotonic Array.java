/**
 * 896. Monotonic Array
 * 
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * Return true if and only if the given array A is monotonic.
 * @author Yogeshwar Chaudhari
 *
 */
class Solution {
    
        public boolean isMonotonic(int[] A) {
    
        // If it is either type - return true
        if(isMonotonicIncreasing(A) || isMonotonicDecreasing(A) ){
            return true;
        }else{
            return false;
        }
        
    }
    
    // Checks if the array is Monotonic Increasing i.e for all i <= j, A[i] <= A[j]. 
    public boolean isMonotonicIncreasing(int[] A){
        for(int i = 0; i < A.length-1; i++){
            if(A[i] > A[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
    // Checks if the array isMonotonicDecreasing -  for all i <= j, A[i] >= A[j].
    public boolean isMonotonicDecreasing(int[] A){
        
        for(int i = 0; i < A.length-1; i++){
            if(A[i] < A[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
}