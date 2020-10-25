/*
	We have a collection of stones, each stone has a positive integer weight.

	Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

	If x == y, both stones are totally destroyed;
	If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
	At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
	
	

*/
class Solution {
    
    public int lastStoneWeight(int[] stones) {
        
        ArrayList<Integer> stonesList = new ArrayList<Integer>();
        for(int stone : stones){
            stonesList.add(stone);
        }
        
        // Sort arrays so that we can pick last 2 elememts
        int x = -1;
        int y = -1;
        
        
        while(stonesList.size() >= 2){
            
            Collections.sort(stonesList);
            
            if(stonesList.size() >= 2){

                // Picking 2 stones, having most weights
                x = stonesList.get(stonesList.size() - 1);
                y = stonesList.get(stonesList.size() - 2);
            
                // Removing those 2 picked elements
                stonesList.remove(stonesList.size() - 1);
                stonesList.remove(stonesList.size() - 1);
                
                if(x == y){
                    continue;
                }else{
                    int difference = Math.abs(x-y);
                    stonesList.add(difference);
                }

            }else{
                return stonesList.get(0);
            }   
        }
        
        
        if(stonesList.size() > 0){
            // One stone will be left in the stones at the end.
            return stonesList.get(0);
        }else{
            
            // If two stones of similar weights remains at the end.
            return 0;
        }
        
    }
    
    
}