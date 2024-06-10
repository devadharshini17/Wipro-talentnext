import java.util.Scanner;
class initial
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter charecters:");
		String x =sc.nextLine();
		if(x.matches("[a-zA-z]+"))
		{
			System.out.println("alphabet");
		}
		else if(x.matches("[0-9]+"))
		{
			System.out.println("integer");
		}
		else if(x.matches("[!-*]+"))
		{
			System.out.println("special charecter ");
		}
		
	}
}