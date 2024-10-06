package com.bptn.course._07_oop;

import java.util.Scanner;

public class Player {
	
	    // Add other instance variable(s)
	    private String name;
	    private String playerNumber;

	    // Question: should scanner be static or not?
	    private static Scanner scanner = new Scanner(System.in);
	    

	    public Player(String name, String playerNumber) {
	        // complete constructor
	    	this.name = name;
	    	this.playerNumber = playerNumber;
	    	
	    }

	    // create getter methods
	    public String getName(String getName) {
	        return name;
	    }

	    public String getPlayerNumber(String getPlayerNumber) {
	        return playerNumber;
	    }

	    public int makeMove() {
	        System.out.println("Make your move. What column do you want to put a token in?");
	        int column = scanner.nextInt(); // receive user input
	        return column;
	    }

	    public String toString() {
	        return ("Player " + playerNumber + " is " + name);
	    }
	    

	public static void main(String[] args) {
		
		

	}

}
