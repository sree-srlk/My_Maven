package sample;

public class Child extends Grand
{
	public void sub(int x, int y)
	{
		int z=x-y;
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.add(10, 20);
		obj.sub(20,10);
	}
		// TODO Auto-generated method stub

	}


