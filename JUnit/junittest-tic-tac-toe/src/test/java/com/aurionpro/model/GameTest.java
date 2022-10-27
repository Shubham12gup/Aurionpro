package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.border.Border;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GameTest {

	Game game;
	Board board;
	Player[] players = { new Player("john"), new Player("Sam") };
	ResultAnalyzer analyzer;

	@BeforeEach
	void init() {

		analyzer = new ResultAnalyzer();
		Board bord = analyzer.getBoard();
		game = new Game(players);

	}

	@Test
	void testPlay_checkPlayerChangeIfProgress() {

		game.play(1);

		if (analyzer.analyzeResult() == ResultType.PROGRESS) {

			assertEquals("Sam", game.getcurrentPlayer().getName());
		}

	}

	@Test
	@DisplayName("check Horizontal WIn X")
	void testAnalyzeResult_CheckTestHorizontalWin1Row() {

//		 X X X               0  1  2
//		 O X O    ---->      3  4  5
//		 X O O               6  7  8

// mapping above 

		// x //0 //x
		game.play(0);
		game.play(8);
		game.play(1);

		game.play(3);
		game.play(2);
		game.play(7);
		// 0 //x //0

		game.play(4);
		game.play(5);
		game.play(6);
		// x //0 // x

		Cell[] cells = game.getBoard().getCells();

		for (Cell c : cells)
			System.out.println(c.getMark());

		assertEquals(ResultType.WIN, game.getResult());

	}

	@Test
	@DisplayName("check vertical WIn X")
	void testAnalyzeResult_CheckTestVerticalWin1Column() {

//		 X O X               0  1  2
//		 X O O    ---->      3  4  5
//		 X X O               6  7  8

// mapping above 

		// x //0 //x
		game.play(0);
		game.play(8);
		game.play(3);

		game.play(5);
		game.play(6);
		game.play(4);
		// 0 //x //0

		game.play(7);
		game.play(1);
		game.play(2);
		// x //0 // x

		Cell[] cells = game.getBoard().getCells();

		for (Cell c : cells)
			System.out.println(c.getMark());

		assertEquals(ResultType.WIN, game.getResult());

	}

	@Test
	@DisplayName("check Diagonal WIn O")
	void testAnalyzeResult_CheckTestDiagonalWin() {

//		 O X X               0  1  2
//		 X O O    ---->      3  4  5
//		 X X O               6  7  8

// mapping above 

		// x //0 //x
		game.play(1);
		game.play(0);
		game.play(2);

		game.play(4);
		game.play(3);
		game.play(5);
		// 0 //x //0

		game.play(7);
		game.play(8);
		game.play(6);
		// x //0 // x

		Cell[] cells = game.getBoard().getCells();

		for (Cell c : cells)
			System.out.println(c.getMark());

		assertEquals(ResultType.WIN, game.getResult());

	}

	@Test
	@DisplayName("check DRAW")
	void testAnalyzeResult_CheckTestDraw() {

//		 X O X               0  1  2
//		 X O O    ---->      3  4  5
//		 O X O               6  7  8

// mapping above 

		// x //0 //x
		game.play(0);
		game.play(1);
		game.play(2);

		game.play(4);
		game.play(3);
		game.play(5);
		// 0 //x //0

		game.play(7);
		game.play(6);
		game.play(8);
		// x //0 // x

		Cell[] cells = game.getBoard().getCells();

		for (Cell c : cells)
			System.out.println(c.getMark());

		assertEquals(ResultType.DRAW, game.getResult());

	}

}
