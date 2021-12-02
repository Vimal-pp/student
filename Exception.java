class Exception
{
	public static void main(String[]args)
	{
	try{
		String s1=args[0];
		String s2=args[1];
		System.out.println(" first value "+s1);
		System.out.println(" second value "+s2);
		int x= Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x/y;
		System.out.println(" The output is "+z);

		}catch(NumberFormatException e)
		 {
	
		System.out.println("vimal");
		  }
 	}
}

