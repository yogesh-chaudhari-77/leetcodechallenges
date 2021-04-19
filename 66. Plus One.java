/*

66. Plus One

Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
*/
class Solution {
    
	public int[] plusOne(int[] digits) {

		// Start from last, and just add one.
		int carry = 1;
		for(int i = digits.length - 1; i >= 0; i--){
			digits[i] = digits[i] + carry;

			if(digits[i] == 10){
				digits[i] = 0;
				carry = 1;
			}else{
				carry = 0;
				break;
			}
		}

		// If the first digit becomes 0, means we need to increase the length of the array.

		if(carry == 1) {

			int [] newDigits = new int [digits.length + 1]; 
			newDigits[0] = 1;
			for(int i = 1; i < digits.length; i++) {
				newDigits[i] = digits[i];
			}

			return newDigits;
		}

		return digits;
	}
}