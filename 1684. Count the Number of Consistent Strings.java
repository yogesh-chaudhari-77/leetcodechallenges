/**
1684. Count the Number of Consistent Strings

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

Constraints:

1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = 0;
        
        for(int i = 0; i < words.length; i++){
            
            String [] chars = words[i].split("");
            
            for(int j = 0; j < chars.length; j++){
                
                if( ! allowed.contains(chars[j]) ){
                    break;
                }
                
                if(j == chars.length - 1){
                    count += 1;
                }
            }
        }
        
        return count;
    }
}