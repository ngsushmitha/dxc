
public class Test6 {

	int countCaps(String data) {
		int ctr = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ctr++;
			}
		}
		return ctr;
	}

	public static void main(String[] args) {

		int result = new Test6().countCaps("AGHDJgdh");
		System.out.println(result);

	}

}
