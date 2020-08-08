/*

1436. Destination City
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly the destination city is "A".

*/

class Solution {
    
    public String destCity(List<List<String>> paths) {
        
        ArrayList<String> destinations = new ArrayList<String>();
        ArrayList<String> starting_pt = new ArrayList<String>();
        
        for(int i = 0; i < paths.size(); i++){
            
            List<String> path = paths.get(i);
            destinations.add(path.get(1));
            starting_pt.add(path.get(0));
        }
        
        for(int i = 0; i < starting_pt.size(); i++){
            destinations.remove(starting_pt.get(i));
        }
        
        System.out.println(starting_pt);
        System.out.println(destinations);
        
        return destinations.get(0);
    }
}