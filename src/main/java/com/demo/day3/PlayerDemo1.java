package com.demo.day3;

public class PlayerDemo1 {
	public static void main(String[] args) {
		Player p1 = new Player();
		System.out.println(p1.getPlayerId() + "  " + p1.getPlayerName() + " " + p1.getCountry());

		// setter - used to change the existing value
//		p1.setPlayerId(1001);
//		p1.setPlayerName("Tom");
//		System.out.println(p1.getPlayerId() + "  " + p1.getPlayerName() + " " + p1.getCountry());
		System.out.println("---------------------------");

		Player p2 = new Player();
		System.out.println(p2.getPlayerId() + "  " + p2.getPlayerName() + " " + p2.getCountry());

		System.out.println("---------------------------");

		Player p3 = new Player(2345, "Rohit Sharma", "India");
		System.out.println(p3.getPlayerId() + "  " + p3.getPlayerName() + " " + p3.getCountry());

		System.out.println("---------------------------");

	Player p4 = new Player(1122, "Dhoni");
	System.out.println(p4.getPlayerId() + "  " + p4.getPlayerName() + " " + p4.getCountry());

	}

}
