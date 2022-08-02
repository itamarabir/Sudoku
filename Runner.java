package Sudoku;

public class Runner {
	public static void main(String[] args) {
		SudokuBoard board = new SudokuBoard();
		System.out.print(board);
		System.out.println();
		intBoard(board);
		board.solve();
		System.out.println();
		System.out.println(board);
	}

	private static void intBoard(SudokuBoard board) {
		board.updateNumberInIndeces(5, true, 0, 0);
		board.updateNumberInIndeces(3, true, 0, 1);
		board.updateNumberInIndeces(7, true, 0, 4);
		board.updateNumberInIndeces(6, true, 1, 0);
		board.updateNumberInIndeces(1, true, 1, 3);
		board.updateNumberInIndeces(9, true, 1, 4);
		board.updateNumberInIndeces(5, true, 1, 5);
		board.updateNumberInIndeces(9, true, 2, 1);
		board.updateNumberInIndeces(8, true, 2, 2);
		board.updateNumberInIndeces(6, true, 2, 7);
		board.updateNumberInIndeces(8, true, 3, 0);
		board.updateNumberInIndeces(6, true, 3, 4);
		board.updateNumberInIndeces(3, true, 3, 8);
		board.updateNumberInIndeces(4, true, 4, 0);
		board.updateNumberInIndeces(8, true, 4, 3);
		board.updateNumberInIndeces(3, true, 4, 5);
		board.updateNumberInIndeces(1, true, 4, 8);
		board.updateNumberInIndeces(7, true, 5, 0);
		board.updateNumberInIndeces(2, true, 5, 4);
		board.updateNumberInIndeces(6, true, 5, 8);
		board.updateNumberInIndeces(6, true, 6, 1);
		board.updateNumberInIndeces(2, true, 6, 6);
		board.updateNumberInIndeces(8, true, 6, 7);
		board.updateNumberInIndeces(4, true, 7, 3);
		board.updateNumberInIndeces(1, true, 7, 4);
		board.updateNumberInIndeces(9, true, 7, 5);
		board.updateNumberInIndeces(5, true, 7, 8);
		board.updateNumberInIndeces(8, true, 8, 4);
		board.updateNumberInIndeces(7, true, 8, 7);
		board.updateNumberInIndeces(9, true, 8, 8);

	}
}
