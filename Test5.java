
public class Test5 {

	boolean isCapsOnly(String data) {
		int ctr = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				ctr++;
			}
		}
		if (ctr == data.length())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		boolean result = new Test5().isCapsOnly("AGHDJDK");
		System.out.println(result);

	}

}
