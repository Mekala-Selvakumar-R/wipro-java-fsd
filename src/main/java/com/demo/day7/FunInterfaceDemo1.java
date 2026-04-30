package com.demo.day7;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunInterfaceDemo1 {

	public static void main(String[] args) {
		
		Consumer<String> greet = name ->System.out.println("Welcome .. " +name);

		greet.accept("Javeed");
		
		IntConsumer  square =x ->{
			int s=x*x;
			System.out.println("square = " +s);
		};
		
		square.accept(5);
		BiConsumer<Integer, Integer> add = (x,y)->System.out.println("sum = "+(x+y));
	   add.accept(50, 90);
	   
	   
	   Supplier<String> msg =()->"Good Afternoon";
	   
	   System.out.println(msg.get());
	   
	   DoubleSupplier  random =()->Math.random();
	   System.out.println(random.getAsDouble());
	   
	   
	   Predicate<Integer> isEven = n->n%2==0;
	   BiPredicate<Integer, Integer> isBig = (n1,n2) ->n1>n2;
	   
	   Predicate<String>  isUpper  =name -> {
		   String  uppername =name.toUpperCase();
		   return uppername.equals(name);
	   };
	   
	   
	   System.out.println(isEven.test(20));
	   System.out.println(isBig.test(45, 66));
	   System.out.println(isUpper.test("ABC"));
	   
	   System.out.println("---------------");
	   
	   Function<Integer, String> numberInWord =n->{
		   String word="";
		   switch(n) {
		   case 1 : word="ONE";
		            break;
		   case 2 :word="TWO";
		            break;
		    default: word="ABoVE TWO";
		   }
		   return word;
	   };
	   
	   System.out.println(numberInWord.apply(2));
	   
	   IntFunction<Integer>  sum = n->{
		   int total=0;
		   for(int i=1;i<=n;i++) {
			   total=total+i;
		   }
		   return total;
		   };
		   
		  System.out.println(sum.apply(5));
	   
	
	BiFunction<Integer, Integer, Double> divide = (x,y) ->(double)x/y;
	System.out.println(divide.apply(15, 4));
} 
	}


