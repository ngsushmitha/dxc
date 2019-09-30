
public class Test8 {

	String myReplace(String data, char oldChar , char newChar)
	{
		char[] arr = data.toCharArray();
		
		for(int i=0;i<data.length();i++)
		{
			if(arr[i]==oldChar)
			{
				arr[i]=newChar;
				break;
			}
		}
		String res = new String(arr);
		return res;
	}
	public static void main(String[] args) {
		String result = new Test8().myReplace("hello",'l','k');
		System.out.println(result);

	}

}
