import java.util.*;
public class Account {

	public double Deposit(double amount,double balence)
	{
		double balenceNew = balence + amount;
		return balenceNew ;
	}
	public double Withdraw(double amount,double balence)
	{
		if(balence<=amount)
		{
			return 0;
		}
		else 
		{
			double balenceNew = balence - amount;
			return balenceNew ;	
		}
	}
	public static void main(String[] args) {
		
		System.out.println("1.Deposit \n 2.Withdraw");
		System.out.println("Enter Your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		System.out.println("Enter Your amount and balence");
		double amount = sc.nextDouble();
		double balence = sc.nextDouble();
		Account ob = new Account();
		switch(ch) {
		case 1 : System.out.println("New Balence is:"+ob.Deposit(amount,balence));
			break;
		case 2 : System.out.println("New Balence is:"+ob.Withdraw(amount,balence));
			break;
		default : System.out.println("Plese select a valid option" );
		}
	}

}
