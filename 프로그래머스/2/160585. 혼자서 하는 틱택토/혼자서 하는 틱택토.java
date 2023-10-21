class Solution {
    public int solution(String[] board) {
        int answer = 1;
        int o = 0;
        int x = 0;
        String diagonal = String.valueOf(board[0].charAt(0)) + board[1].charAt(1) + board[2].charAt(2);
        String diagonal1 = String.valueOf(board[0].charAt(2)) + board[1].charAt(1) + board[2].charAt(0);
        for (String s : board) {
            for (int j = 0; j < board.length; j++) {
                if (s.charAt(j) == 'O') o++;
                if (s.charAt(j) == 'X') x++;
            }
        }
        if ( o - x < 0 || o - x > 1) return 0;
        for (int i = 0; i < board.length; i++) {
            String vertical = String.valueOf(board[0].charAt(i)) + board[1].charAt(i) + board[2].charAt(i);
            boolean O = (board[i].equals("OOO") || vertical.equals("OOO") || diagonal.equals("OOO") || diagonal1.equals("OOO"));
            boolean X = (board[i].equals("XXX") || vertical.equals("XXX") || diagonal.equals("XXX") || diagonal1.equals("XXX"));
            if (O && X) return 0;
            if (O) {
                if (!(o - x == 1)) return 0;
            }
            if (X) {
                if (!(o - x == 0)) return 0;
            }
        }

        return answer;
    }
}