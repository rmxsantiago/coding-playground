import java.lang.*;


public class HelloWorld {
	public static final int NUMBER_LETTERS = 26;

	public static int numberNeeded(String first, String second) {
		int[] charCount1 = getCharCounts(first);
		int[] charCount2 = getCharCounts(second);

		return getDelta(charCount1, charCount2);
	}

	private static int getDelta(int[] charCount1, int[] charCount2) {
		if(charCount1.length != charCount2.length){
			return -1;
		}

		int accumulator = 0;
		for (int i = 0; i < charCount1.length; i++) {
			int difference = charCount1[i] - charCount2[i];
			//Equivalent to Math.abs()
			difference = difference < 0 ? difference * -1 : difference;
			accumulator += difference;
		}

		return accumulator;
	}

	private static int[] getCharCounts(String string) {
		int[] charCounts = new int[NUMBER_LETTERS];
		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);

			int offset = (int) 'a';
			int code = character - offset;
			charCounts[code]++;
		}

		return charCounts;
	}
}
