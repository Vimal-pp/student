class Students
{

	Students()
	{
		s=90;
		name="vicky";
		
	}
	String name;
	int age;
	long ph;
	int s;

	void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.ph);
		System.out.println(this.s);
	}
		void setinfo(String n,int a,long p)
		{
		   Std s1=new Std();
		   Std s2=new Std();
			s1 setStd("vimal",20,976547l);
                        s2 setStd("vicky",22,896321l);
			
			s1.display();
			s2.display();
	}
}


