import java.util.Scanner;
class recivedcmd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String x=sc.nextLine();
		if(args.length <=0)
		//if(x.isEmpty())
		{
			System.out.println("the command line argument is empty");
		}
		else
		{
			System.out.println(x);
		}
	}
}
