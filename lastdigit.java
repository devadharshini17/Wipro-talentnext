import java.util.Scanner;
class lastdigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if((x<=0) && (y<=0))
		{
		if((x%10)==(y%10))
		{
			System.out.println("last digits are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		}
		else{
			System.out.println("enter positive numbers");

		}
	}
}