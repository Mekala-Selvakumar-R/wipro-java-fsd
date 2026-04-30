package com.demo.day4;

public class StrDemo3 {

	public static void main(String[] args) {
		
		//left to right - from the first to last
		String s1="Java is simple.Java is Roubust.java is secure.Java is Platform Independent";
        int pos =s1.indexOf('e');  //start position is 0
        System.out.println(pos);
        System.out.println(s1.indexOf("mple")); //start posiiton 0
        pos = s1.indexOf('e', 14); //start position `14
        System.out.println(pos);
        System.out.println(s1.indexOf("is", 10)); //start position 10
		//right to left  0 from the last to first
        pos = s1.lastIndexOf('e');
        System.out.println(pos);
        System.out.println(s1.lastIndexOf('e', 60));
        System.out.println(s1.lastIndexOf("Java"));
        System.out.println(s1.lastIndexOf("Java",40));;
        
        String str = "Vivek Raj-Udaya-Ankit-Sai Charan-Sanjana";
         String[] resArr=  str.split("-");
         for (String name: resArr) {
			System.out.println(name);
		}
        
        
 
	}

}

