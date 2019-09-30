
public class Test10 {
	
	boolean isEqual(char c1 , char c2){
		
		int ascii1 = c1;
		int ascii2 = c2;
		if(ascii1 >= 65 && ascii1 <= 90){
			ascii1+=32;
		}
		if(ascii2 >= 65 && ascii2 <= 90){
			ascii2+=32;
		}
		if(ascii1==ascii2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		boolean result = new Test10().isEqual('K','l');
		System.out.println(result);

	}

}
