class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        Set<String> set = new HashSet<>();
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(board[i][j] == '.')
                continue;
                String row = "value" + board[i][j] + "row" + i;
                String col = "value" + board[i][j] + "column" + j;
                String box = "value" + board[i][j] + "row" + i/3 + "column" + j/3;
                if (set.contains(row) || set.contains(col) || set.contains(box)){
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }

        }
        return true;
    }
}
