
public class Test3 {

	String hasUpper(String data) {
		int ctr = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ctr++;
			}
		}
		if (ctr > 0)
			return "yes";
		else
			return "no";
	}

	public static void main(String[] args) {

		String result = new Test3().hasUpper("Ahsjfjf");
		System.out.println(result);

	}

}
