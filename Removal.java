/**
 * 
 */
package antimatterRemoval;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author Noah Jaussi
 *
 */
public class Removal {

	public static void antimatter(String line) {
		StringBuilder words = new StringBuilder();
		words.append(line);
		printRemove(words);
	}
	
	private static void printRemove(StringBuilder phrase) {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int indexA = phrase.indexOf("antimatter");
		while(indexA >= 0) {
			phrase.replace(indexA, indexA + 9, "");
			int temp = indexA;
			indexA = phrase.indexOf("antimatter", temp);
		}
		try {
			out.write(phrase.toString());
			out.flush();
		} catch (IOException e) {}
		
	}
	
}
