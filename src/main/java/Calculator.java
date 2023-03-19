import java.lang.Math;
import java.util.Scanner;


public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		int op;
		
		do
		{
			System.out.println("These are operations you can perform: ");
			System.out.println("1: Square root");
			System.out.println("2: Factorial");
			System.out.println("3: Natural logarithm");
			System.out.println("4: Power Function");
			System.out.println("0: Exit");
			System.out.println("Enter an operation number to continue: ");
			
			op = sc.nextInt();
			double val1, ans = 0, val2;
			
			switch(op)
			{
				case 1:
					System.out.println("Enter the value: ");
					val1 = sc.nextDouble();
					ans = calc.squareRoot(val1);
					if(ans==-1)
						System.out.println("Number should not be negative.");
					
					else 
						System.out.println("Square root of "+ val1 + " is " + ans);
					
					
					break;
					
				case 2:
					System.out.println("Enter the number: ");
					val1 = sc.nextDouble();
					ans = calc.factorial(val1);
					if(ans==-1)
						System.out.println("Number should not be negative.");
					
					else
						System.out.println("Factorial of "+ val1 + " is "+ ans);
			
					
					break;
					
				case 3:
					System.out.println("Enter the value: ");
					val1 = sc.nextDouble();
					ans = calc.logarithm(val1);
					if(ans==-1)
						System.out.println("Value should be positive.");
					else
						System.out.println("Natural logarithm of "+ val1 + " is "+ ans);
				
					break;
				
				case 4:
					System.out.println("Enter the x value in x^y: ");
					val1 = sc.nextDouble();
					System.out.println("Enter the y value in x^y: ");
					val2 = sc.nextDouble();
				
					ans = calc.power(val1, val2);
					
					if(ans==-1)
						System.out.println("Both x and y values in x^y can't be 0.");
					
					else
						System.out.println("value of "+ val1 + " to the power of " + val2 + " is "+ ans);
					
					break;
				
				case 0:
					System.out.println("Closing Calculator...");
					break;
					
				default:
					System.out.println("Please enter a valid operation number.");
					
			}
			
		}while(op!=0);
		
		sc.close();
		
	}
	
	public double squareRoot(double val)
	{
		double ans;
		if(val <0)
			ans = -1;
		else
			ans = Math.sqrt(val);
		return ans;
	}
	
	
	public double factorial(double val)
	{
		double ans = 1;
		
		if(val <0)
			ans = -1;
		else
		{
			for(int i=1; i<=val; i++)
				ans *= i;
		}
		
		return ans;
	}
	
	public double logarithm(double val)
	{
		double ans;
		if(val <=0)
			ans = -1;
		else
			ans = Math.log(val);
		return ans;
	}
	
	public double power(double val1, double val2)
	{
		double ans;
		
		if(val1==0 && val2==0)
			ans = -1;
		
		else
			ans = Math.pow(val1,val2);
		
		return ans;
	}
}