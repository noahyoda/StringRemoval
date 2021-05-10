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

	/**
	 * main user method to pass string and remove in fastest method
	 * 
	 * @param string of line
	 * @param string to remove
	 */
	public static void antimatter(String line, String remove) {
		StringBuilder words = new StringBuilder();
		words.append(line);
		printRemove(words, remove);
	}
	/**
	 * pass the string builder and string to remove to generate and print the desired string
	 * 
	 * @param phrase
	 */
	private static void printRemove(StringBuilder phrase, String remove) {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int indexA = phrase.indexOf(remove);
		while(indexA >= 0) {
			phrase.replace(indexA, indexA + remove.length(), "");
			int temp = indexA;
			indexA = phrase.indexOf(remove);
		}
		try {
			out.write(phrase.toString());
			out.flush();
		} catch (IOException e) {}
		
	}
	
}
