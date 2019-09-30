
public class Test11 {

	boolean isEqual(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		int flag=0;
		for (int i = 0; i < c1.length; i++) {
			if (c1[i]==c2[i] || c1[i]==(c2[i]-32) || c1[i]==(c2[i]+32)) {
				flag=1;
			}
			else
			{
				flag=0;
			}
			
		}
		if (flag==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		boolean result = new Test11().isEqual("hello", "olleh");
		System.out.println(result);

	}

}
