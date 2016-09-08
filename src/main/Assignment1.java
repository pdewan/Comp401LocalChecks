package main;

import java.util.Scanner;

public class Assignment1 {

	static Scanner scanner;
	
	public static void main(String[] args){
		scanner = new Scanner(System.in);
		
		boolean isContinuing = true;
		
		while(isContinuing){
			
			System.out.println("String?");
			
			isContinuing = processInput();
		}
		
		System.out.println("Goodbye!");
		
	}
	
	
	
	public static int indexOf(String s, char ch, int startIndex){
		
		for(int i = startIndex+1; i < s.length(); i++){
			
			if(s.charAt(i) == ' '){
				return i;
			}
			
			
		}
		
		return -1;
		
	}
	
	
	public static void scanString(String s){
		
		int startIndex = 0;
		int endIndex = 0;
		int currNum = 0;
		int sum = 0;
		int product = 1;
		String toBeConverted = "";
		boolean dontBreak = true;
		
		System.out.println("Tokens:");
		
		
		while(dontBreak){
			
			endIndex = indexOf(s, ' ', startIndex);
			
			if(endIndex == -1){
				endIndex = s.length();
			}
			
			toBeConverted = s.substring(startIndex, endIndex);
			
			System.out.println(toBeConverted);
			
			currNum = Integer.parseInt(toBeConverted);
			
			sum = sum + currNum;
			product = product * currNum;
			
			startIndex = endIndex + 1;
					
			if(endIndex == s.length()){
				dontBreak  = false;
			}
			
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		
	}
	
	
	public static boolean processInput(){
		
		
		String s = scanner.nextLine();
		
		if(s.charAt(0) == '.'){
			return false;
		}
		
		else{
			scanString(s);
		}
		
		return true;
	}
	
}
