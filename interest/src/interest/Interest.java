package interest;

import java.util.Scanner;

public class Interest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sp=sc.nextDouble();
		double sr=sc.nextDouble();
		double st=sc.nextDouble();
		double cp=sc.nextDouble();
		double cr=sc.nextDouble();
		double ct=sc.nextDouble();
		double result1,result2;
		result1=(sp*st*sr)/100;
		result2=cp*Math.pow((1+cr/100), ct);
		System.out.println("simple interest is:"+result1);
		System.out.println("compound interest is:"+result2);
	}

}
