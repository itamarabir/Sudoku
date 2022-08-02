package Sudoku;

public class NumberInSudoku {
private int number;
private boolean isConstant;


public NumberInSudoku(int number) {
	this(number, false);
}

public NumberInSudoku(int number, boolean isConstant) {
	this.number=number;
	this.isConstant = isConstant;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public boolean isConstant() {
	return isConstant;
}



}
