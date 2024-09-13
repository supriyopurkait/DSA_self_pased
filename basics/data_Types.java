
public class Main
{
	public static void main(String []args)
	{
		Main ob = new Main();
		ob.claculate_size(4);
		ob.clone();
	}
	void claculate_size(int value)
	{
		int size = (Integer.SIZE)/8;
		System.out.println("size of the datatype Int:"+size);
	}
	void claculate_size(char value)
	{
		int size = (Character.SIZE)/8;
		System.out.println("size of the datatype Char:"+size);
	}
	void claculate_size(double value)
	{
		int size = (Double.SIZE)/8;
		System.out.println("size of the datatype Double:"+size);
	}
	void claculate_size(float value)
	{
		int size = (Float.SIZE)/8;
		System.out.println("size of the datatype Float:"+size);
	}
}