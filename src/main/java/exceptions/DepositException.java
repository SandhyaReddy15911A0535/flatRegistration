package exceptions;

public class DepositException  extends Exception{

	public DepositException()
	{
		System.out.println("deposit amount should be greater");
	}
}
