import java.util.regex.Pattern;

interface PhoneNumber {
	boolean numberFormat(String number);
}

abstract class country implements PhoneNumber {
	boolean isNumber(String number) {
		int ctr = 0;
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			int ascii = ch;
			if ((ascii >= 48 && ascii <= 57) || ascii == 43 || ascii == 32 || ascii == 45) {
				ctr++;
			}
		}
		if (ctr == number.length()) {
			return true;
		} else {
			return false;
		}

	}

}

class india extends country {

	public boolean numberFormat(String number) {
		if (isNumber(number)) {
			if (number.length() == 14) {
				boolean res = Pattern.matches("^\\+[9][1][-][0-9]{10}", number);
				if (res) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

class brazil extends country {

	public boolean numberFormat(String number) {
		if (isNumber(number)) {
			if (number.length() == 17) {
				boolean res = Pattern.matches("^\\+[5][5][\\s][0-9]{2}[\\s][0-9]{5}[-][0-9]{4}", number);
				if (res) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

class norway extends country {

	public boolean numberFormat(String number) {
		if (isNumber(number)) {
			if (number.length() == 15) {
				boolean res = Pattern.matches("^\\+[4][7][-][0-9]{2}[-][0-9]{2}[-][0-9]{2}[-][0-9]{2}", number);
				if (res) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

class qatar extends country {

	public boolean numberFormat(String number) {
		if (isNumber(number)) {
			if (number.length() == 14) {
				boolean res = Pattern.matches("^\\+[9][7][4][\\s][0-9]{4}[-][0-9]{4}", number);
				if (res) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}

class turkey extends country {

	public boolean numberFormat(String number) {
		if (isNumber(number)) {
			if (number.length() == 14 || number.length() == 12) {
				if ((Pattern.matches("^\\+[9][0][\\s][5][0][0-9]{1}[-][0-9]{6}", number))
						|| (Pattern.matches("^[0-9]{4}[-][0-9]{3}[-][0-9]{3}", number))) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}

public class Test13 {
	public static void main(String[] args) {
		
		india in = new india();
		boolean result1 = in.numberFormat("+91-9972443355");
		System.out.println(result1);

		brazil br = new brazil();
		boolean result2 = br.numberFormat("+55 15 99999-9999");
		System.out.println(result2);

		norway nr = new norway();
		boolean result3 = nr.numberFormat("+47-49-99-99-99");
		System.out.println(result3);

		qatar qr = new qatar();
		boolean result4 = qr.numberFormat("+974 3399-9999");
		System.out.println(result4);

		turkey tr = new turkey();
		boolean result5 = tr.numberFormat("0509-999-999");
		System.out.println(result5);
	}

}
