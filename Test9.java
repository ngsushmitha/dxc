
public class Test9 {

	String myReplace(String data, char oldChar , char newChar)
	{
		char[] arr = data.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
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
		String result = new Test9().myReplace("hello",'l','k');
		System.out.println(result);

	}

}
