package classABC;

public class B {
	
	private A numbers;

	public B(A numbers) {
		this.numbers = numbers;
	}
	
	public int getLastDigit(int number)
	{
		return Math.abs(number%10);
	}
	
	public int getLastDigitOfNumber1()
	{
		return getLastDigit(numbers.getNumber1());
	}
	
	public int getLastDigitOfNumber2()
	{
		return getLastDigit(numbers.getNumber2());
	}
	
	

}
