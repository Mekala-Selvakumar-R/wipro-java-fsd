package com.demo.day3;

public class Player {

	private int playerId;
	private String playerName;
	private String country;

	// constructor overloading
	public Player() {
		System.out.println("default constructor");
		playerId = 1001;
		playerName = "Virat  kholi";
		country = "India";

	}
	public Player(int playerId) {
		this.playerId = playerId;
		System.out.println("Constructor - with  one argument - playerId");
 	}

	public Player(int playerId, String playerName) {
		this(playerId);
		System.out.println("Constructor - with  two argument - playerId,playerName");

//		this.playerId = playerId;
		this.playerName = playerName;
	}
	public Player(int playerId, String playerName, String country) {
		// 	- Constructor call must be the first statement in a constructor
		this(playerId,playerName);
		System.out.println("Parameterized constructor - int,string,string");
//		this.playerId = playerId;
//		this.playerName = playerName;
		this.country = country;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
