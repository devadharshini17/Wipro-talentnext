import java.util.Scanner;
class sortalp
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter charecters(a-z):");
		char x=sc.next().charAt(0);	
		char y=sc.next().charAt(0);	
		if(x>y)
		{
			System.out.println(y+" "+x);
		}
		else if(y>x)
		{System.out.println(x+" "+y);}
	}

}