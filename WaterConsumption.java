//1b)

import java.util.Scanner;
class WaterConsumption
{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter water consumed in litres: ");
	double consumption= sc.nextDouble();
	int bill;
	if(consumption<=500)
		{
		System.out.println(" your bill is: " + 100);
		}
	else
	    System.out.println("your bill is: " + 200);
	}
}