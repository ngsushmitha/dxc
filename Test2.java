class Test2{
	public static void main(String args[])
		{
			int i=987654321;
			int count=0;
			do
			   {
				i=i/10;
				count++;
			   }
			while(i!=0);
			System.out.println("Number of digits is "+count);
		}
}
