/*
1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.


Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

*/
class Solution {
    
public int diagonalSum(int[][] mat) {
        
        int arrLength = mat.length;
        
        int finalSum = primaryDiagonalSum(mat) + secondaryDiagonalSum(mat);
        
        // For odd length arrays, the diagonal middle element will clash
        if(arrLength % 2 != 0){
        	//System.out.println("Duplicate "+mat[ arrLength /2 ][arrLength /2 ]);
        	finalSum -= mat[ arrLength /2 ][arrLength /2 ];
        }
        
        return finalSum;
        
    }
    
    // Finds the sum of the elements in the primary diagonal
    public int primaryDiagonalSum(int[][] mat){
        
        int sum = 0;
        int j = 0;
        
        // Rows pointer
        for(int i = 0; i < mat.length; i++) {
        	//System.out.println(mat[i][j]);
        	sum += mat[i][j];
        	j += 1;
        }
        
        return sum;
    }
    
    // Finds the sum of the elements in the secondary diagonal
    public int secondaryDiagonalSum(int[][] mat){
        
        int sum = 0;
        int j = mat.length - 1;
        
        // Rows pointer
        for(int i = 0; i < mat.length; i++) {
        	//System.out.println(mat[i][j]);
        	sum += mat[i][j];
        	j -= 1;
        }
        
        return sum;
    }
}