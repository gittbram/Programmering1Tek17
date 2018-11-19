package functions;

import java.util.Scanner;

public class Uppgift7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=0;
			int[] pent=new int[54];
			int m=0;
		int count=0;
		int a=0;
		int count2=0;

		for (int i=1;i<=54;i++)
		{
			x=((i*((3*i)-1))/2);
			pent[m]=x;
			m++;
			count++;
		}
		while(count2<10&&a<51)
			{
		for (int q=0;q<6;q++)
		{
		if(count2==9)
		{
		break;
		}
		if(q==6)
		{
			q=0;
		}
		System.out.print(pent[a]+" ");
			a++;
		}
		System.out.println();
			count2++;
		}
	}
}
	
