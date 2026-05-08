package com.demo.day8;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Create the initial prototype (Expensive setup)
		GameCharacter basicWarrior = new GameCharacter("Base Warrior");
		basicWarrior.loadExpensiveData();

		// Clone the prototype to create new characters quickly
		GameCharacter player1 = basicWarrior.clone();
		player1.setName("Aragon");

		GameCharacter player2 = basicWarrior.clone();
		player2.setName("Boromir");

		System.out.println(player1);
		System.out.println(player2);
	}

}

// 1. The Prototype Class
class GameCharacter implements Cloneable {
	private String name;
	private List<String> abilities;

	public GameCharacter(String name) {
		this.name = name;
		this.abilities = new ArrayList<>();
	}

	// Simulates a heavy operation (e.g., loading assets from disk)
	public void loadExpensiveData() {
		abilities.add("Walk");
		abilities.add("Jump");
		System.out.println("Loading heavy assets for: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public GameCharacter clone() throws CloneNotSupportedException {
		// Perform a deep copy of mutable objects like Lists
		GameCharacter cloned = (GameCharacter) super.clone();
		cloned.abilities = new ArrayList<>(this.abilities);
		return cloned;
	}

	@Override
	public String toString() {
		return "Character [Name=" + name + ", Abilities=" + abilities + "]";
	}
}
