/**
 ******************************************************************************
 *                    HOMEWORK, 15-121
 ******************************************************************************
 *                  THE DOCUMENT DISTANCE
 ******************************************************************************
 *
 * The document distance problem is the problem of computing the distance
 * between two given text documents.
 *
 * The distance between two documents is the angle between their word
 * frequency vectors.
 *
 *
 *****************************************************************************/

import java.util.*;
import java.io.*;
import java.net.*;

public class Distance
{
	//requirements are defined by provided tests
	//       Test1.java, Test2.java, Test3.java, Test4.java
	private HashMap<String, Integer> freqWords = new HashMap<>();
	private int noOfLines;
	private int noOfWords;
	private int noOfDistinctWords;
	private double norm;
	
	private double angle;

	// public Distance(String input) {
	// 	String[] lines = input.split("\n");
	// 	noOfLines = lines.length;
	// 	for(String line: lines) {
	// 		String[] words = line.split(" ");
	// 		for(String word: words) {
	// 			if(freqWords.containsKey(word.toLowerCase())){
	// 				int a = freqWords.get(word.toLowerCase());
	// 				noOfWords++;
	// 				a++;
	// 				freqWords.put(word.toLowerCase(), a);
	// 				//System.out.println(a + " " + word.toLowerCase());
	// 			}
	// 			else {
	// 				freqWords.put(word.toLowerCase(), 1);
	// 				noOfWords++;
	// 			}
	// 		}
			
	// 	}
	// 	noOfDistinctWords = freqWords.size();
	// }
	public Distance(File inputFile) {
		String line = null;
		try {
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
				noOfLines++;
				//line = line.replaceAll("[^A-Za-z0-9_]"," ");
				//line = line.replaceAll("\\s+"," ");
				String[] words = line.split("\\W");

				for(String word: words) {
					word = word.replaceAll("[^A-Za-z0-9 ]","");
					word = word.replaceAll("\\s","");
					if(freqWords.containsKey(word.toLowerCase())){
						//System.out.println(freqWords.get(word.toLowerCase()) + " freq");
						int a = freqWords.get(word.toLowerCase());
						noOfWords++;
						a++;
						//System.out.println(a + " a");
						freqWords.put(word.toLowerCase(), a);
						//System.out.println(freqWords);
						//freqWords.get(word.toLowerCase()) = 2;
						//System.out.println(a + " " + word.toLowerCase());
					} else {
						if(word.length() > 0) {
							freqWords.put(word.toLowerCase(), 1);
							noOfWords++;
						}						
					}
				}				
			}
			noOfDistinctWords = freqWords.size();		
	    } catch(Exception e) {
	        	System.out.println("Exception");
	        }
	}
	public int getNumOfLines(){
		return noOfLines;
	}
	public int getNumOfWords(){
		return noOfWords;
	}
	public int getNumOfDistinctWords(){
		return noOfDistinctWords;
	}
	public double norm() {
		int sum = 0;
		for(int val: freqWords.values()) {
			//System.out.println(val + " vallll");
			sum += Math.pow(val, 2.0); 
		}
		norm = Math.sqrt(sum);
		return norm;
	}
	public HashMap getMap() {
		return freqWords;
	}
	public double innerProduct(HashMap map) {
		double dotProduct = 0.0;
		HashMap<String, Integer> map1 = freqWords;
		HashMap<String, Integer> map2 = map;
		if(map1.size() < map2.size()) {
			map1 = map;
			map2 = freqWords;
		}
		for(String each: map1.keySet()) {
			if(map2.containsKey(each)) {
				int key2 = map2.get(each);
				dotProduct += (map1.get(each) * key2);
			}
			
		}
		return dotProduct;		
	}
	public double angle(Distance map){
 		double numerator = innerProduct(map.freqWords);
 		//System.out.println(numerator);
 		double denominator = norm() * map.norm();
 		//System.out.println(denominator);
 		double angle = numerator/denominator;
 		//return Math.acos(angle);
 		return angle*100;
	}
}