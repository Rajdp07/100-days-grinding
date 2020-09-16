
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pattern
{
	public static void ch_case1(int n) {
		int i,j;
		System.out.println("CASE 1");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			
			System.out.println();
		}
	
	}
	public static void ch_case3(int n) {
		int i,j;
		System.out.println("CASE 3");
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
				System.out.print(j);
			
			System.out.println();
		}
	
	}
	public static void ch_case2(int n) {
		int i,j,k;
		System.out.println("CASE 2");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
				System.out.print(" ");
			for(k=1;k<=n-i+1;k++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	
	}
	
	public static void ch_case4(int n) {
		int i,j,k;
		System.out.println("CASE 4");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<n-i+1;j++)
				System.out.print(" ");
			for(k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	
	}
	public static void ch_case5(int n) {
		int i,j,k;
		System.out.println("CASE 5");
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
				System.out.print(" ");
			for(k=1;k<=(2*i)-1;k++)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	
	}
	public static void ch_case6(int n) {
		int i,j,k;
		System.out.println("CASE 6");

		for(i=1;i<=n;i++)
		{
			for(k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=((n-i)*2)+1;j++)
				System.out.print(j);
			
			System.out.println();
		}
	
	}
	
	
	public static void main(String args[]) throws IOException
	{
		int i ,j,n ,c;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("SELECT PATTERN FROM THE FOLLOWING");
		ch_case1(4);
		ch_case2(4);
		ch_case3(4);
		ch_case4(4);
		ch_case5(4);
		ch_case6(4);
		
		System.out.println("Enter your Choice:");
		c=Integer.parseInt(in.readLine());
		
		switch(c)
		{
			case 1:
				System.out.println("Enter height:");
			
				n=Integer.parseInt(in.readLine());
				ch_case1(n);
				break;
			case 2:
				System.out.println("Enter height:");
			
				n=Integer.parseInt(in.readLine());
				ch_case2(n);
				break;
			case 3:
				System.out.println("Enter height:");
			
				n=Integer.parseInt(in.readLine());
				ch_case3(n);
				break;
			case 4:
				System.out.println("Enter height:");
			
				n=Integer.parseInt(in.readLine());
				ch_case4(n);
				break;
			case 5:
				System.out.println("Enter height:");
			
				n=Integer.parseInt(in.readLine());
				ch_case5(n);
				break;
			case 6:
				System.out.println("Enter height:");
			
				n=Integer.parseInt(in.readLine());
				ch_case6(n);
				break;
		default:
			System.out.println("Try again");
			
	}}
}
