 class Vowel {

	public static void main(String[] args) {

		System.out.println(stringContainsVowels("TO")); // true
		System.out.println(stringContainsVowels("Sudip")); // false

	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}

}
