package com.chainsys.springproject.beans;

public class ScoreBoard {
	public int targetScore;
	
	private ScoreBoard() {
		System.out.println("score board object craeted");
	}
	private ScoreBoard(int runs) {
		targetScore=runs;
		System.out.println("score board object craeted" +runs);
	}
//factory method - the methods are static here
	public static ScoreBoard createObject() {
		return new ScoreBoard(240);
		//return new ScoreBoard();
		
	}
	public static ScoreBoard createObject(int runs) {
		return new ScoreBoard(runs);
		//return new ScoreBoard();
		
	}
}
