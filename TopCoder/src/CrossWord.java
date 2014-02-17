public class CrossWord {
	public static int countWords(String[] board, int size) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			int c = 0;
			for (int j = 0; j < board[i].length(); j++) {
				c++;
				
				if (board[i].charAt(j) == 'X') {
					c = 0;
				}
				
				if (c > size) {
					count -= 1;
					c = 0;
				} else if (c == size) {
					count++;
				}

			}
		}
		return count;
	}

	public static void main(String[] args) {

		String[][] board = {
				{ "X....X", "X.XX.X", "...X..", "X.XX.X", "..X..." },
				{ "...X...", ".X...X.", "..X.X..", "X..X..X", "..X.X..",
						".X...X.", "...X..." },
				{ ".....X....X....", ".....X....X....", "..........X....",
						"....X....X.....", "...X....X....XX",
						"XXX...X....X...", ".....X....X....",
						".......X.......", "....X....X.....",
						"...X....X...XXX", "XX....X....X...",
						".....X....X....", "....X..........",
						"....X....X.....", "....X....X....." },
				{ "...", "...", "..." }, { "....", "....", "...." } };
		int[]size={3,3,5,50,3};
		for(int i=0;i<board.length;i++){
			System.out.println(countWords(board[i],size[i]));
		}
	}

}
