/*
	1323. Maximum 69 Number
	
	Given a positive integer num consisting only of digits 6 and 9.

	Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
*/
class Solution {
    public int maximum69Number (int num) {
        
        String [] digits = String.valueOf(num).split("");
        
        for(int i = 0; i < digits.length; i++){
            if(digits[i].contentEquals("6")){
                digits[i] = "9";
                break;
            }
        }
        
        int maxNumber = Integer.parseInt(String.join("", digits));
        
        return maxNumber;
        
    }
}