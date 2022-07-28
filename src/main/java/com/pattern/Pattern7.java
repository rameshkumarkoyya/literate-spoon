package com.pattern;

public class Pattern7 {

	public static void main(String[] args) {

		String s = "JAVA";
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(j < i) {
					System.out.print("  ");
				} else {
					System.out.print(s.charAt(j) + " ");
				}
			}
			System.out.println();
		}
		
	}

}
