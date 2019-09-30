
public class Test4 {

	String hasNumber(String data) {
		int ctr = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			int ascii = ch;
			if (ascii >= 48 && ascii <= 57) {
				ctr++;
			}
		}
		if (ctr > 0)
			return "yes";
		else
			return "no";
	}

	public static void main(String[] args) {

		String result = new Test4().hasNumber("Ahjfjf");
		System.out.println(result);

	}

}
