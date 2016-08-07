package com.nat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class LetterCounter {

	public void count(String sourceFilePath, String outputFilePath){
		
		List wordLengths = new ArrayList();
		String[] wordsFromSingleLine = null;
		
		PrintWriter writer;
		FileReader fr;
		BufferedReader br;
		
		String line;
		
		try {
			fr = new FileReader(new File(sourceFilePath));
			br = new BufferedReader(fr);
			writer = new PrintWriter(outputFilePath, "UTF-8");
			
			while((line = br.readLine())!=null){
				wordsFromSingleLine = line.split(" ");
				for (String word : wordsFromSingleLine) {
					if(word.contains(",")||word.contains(".")||word.contains("?")||word.contains("!")){
						wordLengths.add(word.length()-1);
					}else{
						wordLengths.add(word.length());
					}
				}
				writer.println(wordLengths.toString().replace(',',' '));
				wordLengths.clear();
			}

			writer.close();	
			
		} catch (FileNotFoundException e) {
			System.out.println("File missing: "+e);
		} catch (UnsupportedEncodingException e) {
				System.out.println("Encoding failed: "+e);
		} catch (Exception e){
				System.out.println("Processing failed "+e);
		}
	}
}
