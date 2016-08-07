package com.nat;

public class Main {

	
	public static void main(String[] args){
		
		LetterCounter counter = new LetterCounter();
		
		//String inputFilePath = args[0];
		//String outPutFilePath = args[1];
		
		String inputFilePath = "text.txt";
		String outPutFilePath = "wynik.txt";
		
		counter.count(inputFilePath,outPutFilePath);
	}
}
