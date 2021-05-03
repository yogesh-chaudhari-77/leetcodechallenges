/**
999. Available Captures for Rook

On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number of white bishops 'B', black pawns 'p', and empty squares '.'.

When the rook moves, it chooses one of four cardinal directions (north, east, south, or west), then moves in that direction until it chooses to stop, reaches the edge of the board, captures a black pawn, or is blocked by a white bishop. A rook is considered attacking a pawn if the rook can capture the pawn on the rook's turn. The number of available captures for the white rook is the number of pawns that the rook is attacking.

Return the number of available captures for the white rook.

Input: board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: In this example, the rook is attacking all the pawns.

Input: board = [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 0
Explanation: The bishops are blocking the rook from attacking any of the pawns.

https://leetcode.com/problems/available-captures-for-rook/
*/

class Solution {
    public int numRookCaptures(char[][] board) {
        
        int r_row = -1;
        int r_col = -1;
        boolean l_hit = false;
        boolean r_hit = false;
        boolean t_hit = false;
        boolean b_hit = false;
        int finalHitCount = 0;

        // Find the pos of the Rook
        outerloop:
        for(int i = 0, rows = board.length; i < rows; i++){
         
            for(int j = 0, cols = board[i].length; j < cols; j++){
                
                if( board[i][j] == 'R'){
                    r_row = i;
                    r_col = j;
                    break outerloop;
                }
            }
        }
        
        // Left hit
        for(int i = r_col; i >= 0; i--){
            
            if(board[r_row][i] == 'p'){
                l_hit = true;
                break;
            }else if (board[r_row][i] == '.'){
                continue;
            }else if(board[r_row][i] == 'B'){
                break;
            }
            
        }
        
        // Right Hit
        for(int i = r_col; i < 8; i++){
            
            if(board[r_row][i] == 'p'){
                r_hit = true;
                break;
            }else if (board[r_row][i] == '.'){
                continue;
            }else if(board[r_row][i] == 'B'){
                break;
            }
        }
        
        // Bottom Hit
        for(int i = r_row; i < 8; i++){
            
            if(board[i][r_col] == 'p'){
                b_hit = true;
                break;
            }else if (board[i][r_col] == '.'){
                continue;
            }else if(board[i][r_col] == 'B'){
                break;
            }
        }
        
        // top Hit
        for(int i = r_row; i >= 0; i--){
            
            if(board[i][r_col] == 'p'){
                t_hit = true;
                break;
            }else if (board[i][r_col] == '.'){
                continue;
            }else if(board[i][r_col] == 'B'){
                break;
            }
        }
        
        if(r_hit){
            finalHitCount += 1;
        }
        if(l_hit){
            finalHitCount += 1;
        }
        if(t_hit){
            finalHitCount += 1;
        }
        if(b_hit){
            finalHitCount += 1;
        }
        
        return finalHitCount;
    }
}