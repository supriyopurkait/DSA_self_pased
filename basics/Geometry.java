import java.util.*;
class Geometry
{
	public static void main(String []args)
	throws Exception 
	{ 
		Scanner obj = new Scanner(System.in);
		Geometry object = new Geometry();
		double result=0;
		System.out.println("enter your choice");
		System.out.println("choose a option:\n1.calculate radius of circle 2.calculate area of retrangle");
		int hold = obj.nextInt();
		
		switch(hold)
		{
			case 1:System.out.println("enter radius");
					double radius = obj.nextDouble();
					result = object.cal_size(radius);
					break;
			case 2: System.out.println("enter Length and breath");
					double length = obj.nextDouble();
					double breath = obj.nextDouble();
					result = object.cal_size(length,breath);
					break;
			default: System.out.println("input a valid option");
		}
		System.out.println("result is:"+result);
		obj.close(); 
	}
	
	
	double cal_size(double radius)
	{
		return(3.14*radius*radius);
	}
	double cal_size(double length, double breath)
	{
		return(length*breath);
	}
}