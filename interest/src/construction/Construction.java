package construction;

import java.util.Scanner;

public class Construction {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int area=sc.nextInt();
		if(n.equals("standardmaterial"))
		{
			System.out.println("Constructioncost:"+area*1200);
		}
		else if(n.equals("abovehighstandard"))
		{
			System.out.println("Constructioncost:"+area*1500);
		}
		else if(n.contentEquals("highstandardmaterial"))
		{
			System.out.println("Constructioncost:"+area*1800);
		}
		else if(n.contentEquals("fullyautomated"))
		{
			System.out.println("Constructioncost:"+area*2500);
		}
	}
}
