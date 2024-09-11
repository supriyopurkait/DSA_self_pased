class Grater_Lesser
{
	public static void main(String []args)
	{
		Grater_Lesser obj = new Grater_Lesser();
		int n = (int)obj.check(8,10);
		System.out.println(n+" Is grater");
	}
	int check(double m, double n)
	{
		if(m>n){
			return ((int)m);
		}else {
			return ((int)n);			
		} 
	}

}