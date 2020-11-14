/*
1002. Find Common Characters.

Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
You may return the answer in any order.

Input: ["bella","label","roller"]
Output: ["e","l","l"]

Input: ["cool","lock","cook"]
Output: ["c","o"]

*/
class Solution {
	public List<String> commonChars(String[] A) {

		int stringMinLength = 32000;

		List<List<String>> givenStrings = new ArrayList<List<String>>();
		ArrayList<String> answer = new ArrayList<String>();


		// Transformation is required for easy removal and searching
		for(int i = 0; i < A.length; i++){

			int thisStringLength = A[i].length();

			if(thisStringLength < stringMinLength){
				stringMinLength = thisStringLength;
			}

			List<String> charsInString = new ArrayList<>(Arrays.asList( A[i].split("") ));
			givenStrings.add( charsInString );
		}

		//System.out.println(stringMinLength);

		for(int j = 0; j < stringMinLength; j++){

			String currStr = givenStrings.get(0).get(0);
			//System.out.println(currStr);
			boolean containsInAll = true;

			for(int k = 0; k < givenStrings.size(); k++){
				int indexOf = givenStrings.get(k).indexOf(currStr);

				if(indexOf >= 0 ){
					givenStrings.get(k).remove(indexOf);

				}else{
					containsInAll = false;
					break;
				}
			}

			if(containsInAll){
				answer.add(currStr);
			}
		}

		return answer;

	}
}