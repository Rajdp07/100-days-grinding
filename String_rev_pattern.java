import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pattern
{
	public static void ch_case1(String s) {
		int i,j;
		String str="";
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		System.out.println("CASE 1");
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<=i;j++)
				System.out.print(str.charAt(j));
			
			System.out.println();
		}
	
	}
	public static void ch_case3(String s) {
		int i,j;
		String str="";
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		System.out.println("CASE 3");
		for(i=0;i<str.length();i++)
		{
			for(j=i;j<=str.length()-1;j++)
				System.out.print(str.charAt(j));
			
			System.out.println();
		}
	
	}
	public static void ch_case2(String s) {
		int i,j,k;
		String str="";
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		System.out.println("CASE 2");
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<=i;j++)
				System.out.print(" ");
			for(k=0;k<=str.length()-i-1;k++)
			{
				System.out.print(str.charAt(k));
			}
			
			System.out.println();
		}
	
	}
	
	public static void ch_case4(String s) {
		int i,j,k;
		String str="";
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		System.out.println("CASE 4");
		for(i=0;i<str.length();i++)
		{
			for(j=1;j<=str.length()-i-1;j++)
				System.out.print(" ");
			for(k=0;k<=i;k++)
			{
				System.out.print(str.charAt(k));
			}
			
			System.out.println();
		}
	
	}
	public static void ch_case5(String s) {
		int i,j,k;
		String str="";
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		System.out.println("CASE 5");
		for(i=0;i<=str.length()-1;i++)
		{
			for(j=i;j<=str.length()-1;j++)
				System.out.print(str.charAt(i));
		
			System.out.println();
		}
	
	}
	public static void ch_case6(String s) {
		int i,j,k;
		String str="";
		for(i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
		System.out.println("CASE 6");

		for(i=0;i<=str.length()-1;i++)
		{
			for(k=0;k<=i;k++)
			{
				System.out.print(str.charAt(i));
			}
			
			
			System.out.println();
		}
	
	}
	
	
	public static void main(String args[]) throws IOException
	{
		int i ,j ,c;
		String s;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("SELECT PATTERN FROM THE FOLLOWING");
		ch_case1("BLUEJ");
		ch_case2("BLUEJ");
		ch_case3("BLUEJ");
		ch_case4("BLUEJ");
		ch_case5("BLUEJ");
		ch_case6("BLUEJ");
		
		System.out.println("Enter your Choice:");
		c=Integer.parseInt(in.readLine());
		
		switch(c)
		{
			case 1:
				System.out.println("Enter A word:");
			
				s=in.readLine();
				ch_case1(s);
				break;
			case 2:
				System.out.println("Enter a word:");
			
				s=in.readLine();
				ch_case2(s);
				break;
			case 3:
				System.out.println("Enter a word:");
			
				s=in.readLine();
				ch_case3(s);
				break;
			case 4:
				System.out.println("Enter a word:");
			
				s=in.readLine();
				ch_case4(s);
				break;
			case 5:
				System.out.println("Enter a word:");
			
				s=in.readLine();
				ch_case5(s);
				break;
			case 6:
				System.out.println("Enter a word");
			
				s=in.readLine();
				ch_case6(s);
				break;
		default:
			System.out.println("Try again");
			
	}}
}
