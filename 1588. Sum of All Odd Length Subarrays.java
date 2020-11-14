/*
1588. Sum of All Odd Length Subarrays

Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
A subarray is a contiguous subsequence of the array.
Return the sum of all odd-length subarrays of arr.

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

*/
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

		// This is max length of subarray
		int arrLength = arr.length;
		int runCount = -1;
		int finalRetSum = 0;
		HashMap<Integer, Integer> finalSum = new HashMap<Integer, Integer>();

		// If even length array, then sub array length would be arrLength - 1;
		if(arrLength % 2 == 0){
			runCount = arrLength - 1;    
		}else{
			// Otherwise, the last array would be same as original array
			runCount = arrLength;
		}


		// Determines the odd numbers for which arrays would be produced.
		for(int i = 1; i <= runCount; i = i+2){
			finalSum.put(i, 0);
		}

		// Form subarray and and make the summation
		for(int i = 1; i <= runCount; i = i+2){

            // While slicing every 
			for(int j = 0; j < arrLength; j++){

				// Check if the sub array is within limit of original array
				if( (i + j) <= arrLength){
					for(int k = j; k < i + j; k++){
						System.out.print(arr[k]+",");
						finalSum.put(i, finalSum.get(i) + arr[k]);
					}
				}
				System.out.println();
			}

		}

		// Make the final sum of all the odd arrays
		for(int number : finalSum.values()){
			finalRetSum += number;
		}

		// Return final sum
		return finalRetSum;
	}
}