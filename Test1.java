class Test1 {
	public static void main(String args[]) {

		String s = "hello welcome to java world";

		for (int x = s.length() - 1; x >= 0; x--) {
			char c = s.charAt(x);
			System.out.print(c);

		}
		System.out.println("\n");
		s = s.toLowerCase();
		int vowel = 0, consn = 0;
		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else {
				consn++;
			}
		}
		System.out.println("Vowel =" + vowel + " consonants =" + consn);
	}
}
