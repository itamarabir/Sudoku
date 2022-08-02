package Sudoku;

public class SudokuBoard {
	private NumberInSudoku[][] board = new NumberInSudoku[9][9];
	private static final int MAX_INDEX = 9;
	private static final int MIN_INDEX = 0;
	private static final int MIN_value = 1;


	public boolean updateNumberInIndeces(int number, int row, int col) {

		return updateNumberInIndeces(number, false, row, col);
	}

	public boolean updateNumberInIndeces(int number, boolean isConstant, int row, int col) {
		if (row < MIN_INDEX || col < MIN_INDEX || row > MAX_INDEX || col > MAX_INDEX) {

			System.out.println("Errow, can't add number to indeces: " + row + "/" + col);
			return false;
		}
		board[row][col] = new NumberInSudoku(number, isConstant);
		return true;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j > 0) {
					str += " ";
				}
				if (board[i][j] != null) {
					str += board[i][j].getNumber();
				} else {
					str += "*";

				}
			}
			str += "\n";
		}

		return str;
	}

	public void solve() {
		solve(0, 0);

	}

	public boolean solve(int row, int col) {
		if (row == MAX_INDEX) {
			return true;
		}
		if (col == MAX_INDEX) {
			return solve(row + 1, 0);
		}
		if (board[row][col] != null && board[row][col].isConstant()) {
			return solve(row, col + 1);
		}
		for (int number = MIN_value; number <= MAX_INDEX; number++)
			if (isOk(row, col, number)) {

				board[row][col] = new NumberInSudoku(number);
				boolean isOk = solve(row, col + 1);
				if (isOk) {
					return isOk;
				}

			}
		board[row][col] = null;
		return false;

	}

	private boolean isOk(int row, int col, int number) {
		for (int currenRow = MIN_INDEX; currenRow < MAX_INDEX; currenRow++) {
			if (board[currenRow][col] != null && board[currenRow][col].getNumber() == number) {
				return false;
			}
		}

		for (int currenCol = MIN_INDEX; currenCol < MAX_INDEX; currenCol++) {
			if (board[row][currenCol] != null && board[row][currenCol].getNumber() == number) {
				return false;
			}
		}
		return isSmallSquareOk(row, col, number);

	}

	public boolean isSmallSquareOk(int row, int col, int number) {
		int bigRowIndex = row / 3;
		int bigColIndex = col / 3;
		for (int currentRow = 0; currentRow < 3; currentRow++) {
			for (int currentCol = 0; currentCol < 3; currentCol++) {
				int rowIndex = bigRowIndex * 3 + currentRow;
				int colIndex = bigColIndex * 3 + currentCol;
				if (board[rowIndex][colIndex] != null && board[rowIndex][colIndex].getNumber() == number)
					return false;
			}

		}
		return true;
	}
}
