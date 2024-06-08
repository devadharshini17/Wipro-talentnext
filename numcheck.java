import java.util.Scanner;
class numcheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int x = sc.nextInt();
		if(x>0)
		{
			System.out.println("positive!");
		}
		else if(x<0)
		{
			System.out.println("negative!");
		}
		else if(x==0)
		{
			System.out.println("zero");
		}
		else{
		System.out.println("invalid input");
		}
	}
}
