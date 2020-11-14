/*
1556. Thousand Separator
Given an integer n, add a dot (".") as the thousands separator and return it in string format.
*/
class Solution {
    public String thousandSeparator(int n) {
        
		StringBuilder formattedString = new StringBuilder();
		String givenNumber = String.valueOf(n);

        // Spliting the string into digits for easier handling
		String [] digits = givenNumber.split("");

		int j = 0;
        // Iterating over digits from the end
		for(int i = (digits.length - 1); i >= 0; i--){
			
            // place . after every third place
			if(j != 0 && j % 3 == 0) {
				formattedString.append(".");
			}
			formattedString.append(digits[i]);
			j++;
		}
		
        // Due to append method, need to reverse the string
		formattedString.reverse();
		System.out.println(formattedString.toString());
		
		return formattedString.toString();
    }
}