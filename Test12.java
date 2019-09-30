
public class Test12 {

	String myMethod(String data) {
		int[] index = new int[data.length()];
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			index[i]=data.length()+3;
		}
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			int ascii = ch;
			if (ascii >= 65 && ascii <= 90) {
				index[count++]=i; //index values
			}
		}
		//for(int i=0;i<index.length;i++){
		//System.out.println(index[i]);
		//}
		char[] arr = data.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			int ascii = ch;  //lowercase
			if (ascii >= 65 && ascii <= 90) {
				ascii+=32;
				arr[i]=(char)ascii;
			}
			else
			{
				arr[i]=arr[i];
			}
		}
		//System.out.println(arr);
		char[] rev= new char[data.length()];
		int pos=0;
		for (int x = arr.length - 1; x >= 0; x--) {
			rev[pos++] = arr[x]; // reversing
		}
		
		//System.out.println(rev);
		
		for(int i=0;i<rev.length;i++)
		{
			for(int j=0;j<index.length;j++)
			{
				if(i==index[j])
				{
					int a = rev[i];  //changing case
					a-=32;
					rev[i]=(char)a;
					//rev[i]=rev[i]-32;
				}
				else
				{
					rev[i]=rev[i];
				}
			}
		}
		//System.out.println(rev);
		String r = new String(rev);
		return r;	 
			
	}
	public static void main(String[] args) {
		String result = new Test12().myMethod("MyJavaWorld");
		System.out.println(result);

	}

}
