import java.util.Scanner;
class CommandLineArgs {
    public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the company name:");
		String x=sc.nextLine();
		System.out.println("enter the company location :");
		String y=sc.nextLine();

		System.out.println(x + " Technologies " + y);       
    }
}