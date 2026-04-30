package com.demo.day4;

public interface Socket {
//	Default methods are inherited by classes; static methods belong only to the interface.
    public void plugIn();   // abstract

    default public  void safetyNote() {
        System.out.println("Use 3-pin socket for safety");
    }
    static void voltageInfo() {
        System.out.println("Voltage is 230V");
    }


}

class TableFan implements Socket {
    public void plugIn() {
        System.out.println("Fan is rotating");
    }
    
    public void display() {
    	Socket.voltageInfo();  //calling is allowed , but you can't override in the class
    }
    // overrides com.demo.day4.Socket.safetyNote
//    public void safetyNote() {
//    	System.out.println("It is a overrided method in the class");
//    }
}
