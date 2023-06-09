package classABC;

public class Test {

	public static void main(String[] args) {
		A numbers =new A(106,112);
		B numberFetcher=new B(numbers);
		C multiplier =new C(numberFetcher);
		
		int result=multiplier.multiplyLastDigits();
		
		System.out.println("Multiplication of last digits :"+result);
	}
}
