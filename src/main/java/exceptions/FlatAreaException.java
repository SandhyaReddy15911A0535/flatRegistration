package exceptions;

public class FlatAreaException extends Exception{

	public FlatAreaException()
	{
		System.out.println("flat area should not be less than zero");
	}
}
