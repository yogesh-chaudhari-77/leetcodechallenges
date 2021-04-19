/*
1773. Count Items Matching a Rule

You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].

Constraints:

1 <= items.length <= 104
1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
ruleKey is equal to either "type", "color", or "name".
All strings consist only of lowercase letters.

*/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int index = ruleIndex(ruleKey);
        int matchingRecords = 0;
        
        for(int i = 0; i < items.size(); i++){
            if( ( items.get(i).get(index) ).equalsIgnoreCase(ruleValue) ){
                matchingRecords = matchingRecords + 1;
            }
        }
        
        return matchingRecords;
        
    }
    
    public int ruleIndex(String ruleKey){
        
        if(ruleKey.equalsIgnoreCase("type")){
            return 0;
        }else if(ruleKey.equalsIgnoreCase("color")){
            return 1;
        }else if(ruleKey.equalsIgnoreCase("name")){
            return 2;
        }
        
        // Hopefully we never reach here.
        return 0;
    }
}