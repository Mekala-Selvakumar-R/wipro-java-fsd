package com.demo.day3;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		C c = new C();
		ScientificCalculator sc = new ScientificCalculator();
   ScientificCalculator sc1 = new ScientificCalculator(500, 700, 900);
   System.out.println(sc1.addition());
	}

}

class A{
	public A() {
		System.out.println("Constructor -A");
 	}
}

class B extends  A{
	public B() {
		System.out.println("Constructor -B");
 	}
}
class C extends B{
	public C() {
		System.out.println("Constructor -C");
 	}
}