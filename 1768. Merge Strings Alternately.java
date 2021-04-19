/*

1768. Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.

*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String [] word1_tokens = word1.split("");
        String [] word2_tokens = word2.split("");
        
        StringBuilder mergedString = new StringBuilder();
        
        String [] word3_tokens = new String [word1_tokens.length + word2_tokens.length];
        
        int minLength = Math.min(word1_tokens.length, word2_tokens.length);
        
        for(int i = 0; i < minLength; i++){
            mergedString.append(word1_tokens[i]);
            mergedString.append(word2_tokens[i]);
            
            word1_tokens[i] = "";
            word2_tokens[i] = "";
        }
        
        mergedString.append( String.join("", word1_tokens)).append(String.join("", word2_tokens));
        
        return mergedString.toString();
        
    }
}