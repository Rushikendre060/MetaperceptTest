package classABC;

public class C {

	private B numberFetcher;

	public C(B numberFetcher) {
		this.numberFetcher = numberFetcher;
	}
	
	public int multiplyLastDigits()
	{
		int lastDigit1=numberFetcher.getLastDigitOfNumber1();
		int lastDigit2=numberFetcher.getLastDigitOfNumber2();
		
		return lastDigit1*lastDigit2;
	}
	
}
