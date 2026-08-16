class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            HashSet<Character> seen=new HashSet<>();
            for(int col=0;col<9;col++){
                char val=board[row][col];
                if(val!='.'){
                    if(seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }
        for(int col=0;col<9;col++){
            HashSet<Character> seen=new HashSet<>();
            for(int row=0;row<9;row++){
                char val=board[row][col];
                if(val!='.'){
                    if(seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            // Loop through the starting column index of each 3x3 box (0, 3, 6)
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> seen = new HashSet<>();
                // Iterate through the 3x3 cells inside the current box
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        char val = board[boxRow + r][boxCol + c];
                        if (val != '.') {
                            if (seen.contains(val)) return false;
                            seen.add(val);
                        }
                    }
                }
            }
        }
return true;
    }
}
