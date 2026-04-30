package com.demo.day4;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
		TableFan  tb = new TableFan();
		tb.plugIn();
		tb.safetyNote();
		
		Socket s = new TableFan();
		s.plugIn();
		s.safetyNote();   // inherited default method
  Socket.voltageInfo();
 
	}
	

}
