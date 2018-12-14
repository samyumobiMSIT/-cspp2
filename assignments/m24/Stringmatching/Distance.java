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

public class Distance {
	//requirements are defined by provided tests
	//       Test1.java, Test2.java, Test3.java, Test4.java
	private HashMap<String, Integer> freqWords = new HashMap<>();
	String s1 = "";
	String s2 = "";
	double ans;

	public Distance(File inputFile, File inputFile2) {
		String line;
		try {
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				s1 += line;
			}
			fileReader = new FileReader(inputFile2);
			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				s2 += line;
			}
			//System.out.println(s1);
			String lcs = "";
			for (int i = 0; i < s2.length(); i++) {
				for (int j = i + 1 ; j <= s2.length(); j++) {
					if (s1.contains(s2.substring(i, j))) {
						if (s2.substring(i, j).length() > lcs.length()) {
							lcs = s2.substring(i, j);
						}
					}
				}
			}
			if (inputFile.getName().equals(inputFile2.getName())) {
				ans = 100;
			} else {
				double numerator = lcs.length() * 2 * 100;
				//System.out.print(numerator + " ");
				double denominator = s1.length() + s2.length();
				//System.out.print(denominator + " ");
				//System.out.print(numerator/denominator + " ");
				ans = Math.round(numerator / denominator);

			}
			System.out.format("%13.1f", ans);


		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
	public double getSimilarity() {
		return ans;
	}
}