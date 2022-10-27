package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer(Board board) {
		this.board = board;
		this.result = ResultType.PROGRESS;
	}

	public void horizontalWinCheck() {
//		if (board.getCells().get(0).getMark() == MarkType.X) {			
		for (int i = 0; i < 9; i=i+3) {
			if ((board.getCellMark(i) == MarkType.X && board.getCellMark(i+1) == MarkType.X && board.getCellMark(i+2) == MarkType.X) ||
					(board.getCellMark(i) == MarkType.O && board.getCellMark(i+1) == MarkType.O && board.getCellMark(i+2) == MarkType.O)) {
				result = ResultType.WIN;
				break;
			}
			else {
				result = ResultType.PROGRESS;
			}
		}
	}

	public void vertictalWinCheck() {
//		if (board.getCells().get(0).getMark() == MarkType.X) {			
		for (int i = 0; i < 3; i++) {
			if ((board.getCellMark(i) == MarkType.X && board.getCellMark(i+3) == MarkType.X && board.getCellMark(i+6) == MarkType.X) ||
			(board.getCellMark(i) == MarkType.O && board.getCellMark(i+1) == MarkType.O && board.getCellMark(i+2) == MarkType.O)){
				result = ResultType.WIN;
				break;
			} else {
				result = ResultType.PROGRESS;
			}
		}
	}
	
	public void diagonalWinCheck() {
		if ((board.getCellMark(0) == MarkType.X && board.getCellMark(4) == MarkType.X && board.getCellMark(8) == MarkType.X) ||
				(board.getCellMark(0) == MarkType.X && board.getCellMark(4) == MarkType.X && board.getCellMark(8) == MarkType.X) ||
					(board.getCellMark(0) == MarkType.O && board.getCellMark(4) == MarkType.O && board.getCellMark(8) == MarkType.O) ||
						(board.getCellMark(0) == MarkType.O && board.getCellMark(4) == MarkType.O && board.getCellMark(8) == MarkType.O)) {
			result = ResultType.WIN;
		}
		else {
			result = ResultType.PROGRESS;
		}

	}
	
	public ResultType analyzeResult() {
//		return result;
		
	}
	
}
