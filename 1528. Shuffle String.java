/*
1528. Shuffle String

Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
*/

class Solution {
    public String restoreString(String s, int[] indices) {
        
        String [] newStr = new String [indices.length];
        String [] existingStr = s.split("");
        
        int i = 0;
        for(int index : indices){
            
            newStr[index] = existingStr[i];
            i += 1;
        }
        
        return String.join("", newStr);
    }
}