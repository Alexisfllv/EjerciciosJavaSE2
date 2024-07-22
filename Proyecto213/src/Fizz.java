
public class Fizz {

	
	public static void main (String [] args) {
		
		/**
		for (int i = 1; i <=100; i++) {
			String n3 =(i%3==0)? "Fizz":"";
			String n5 =(i%5==0)? "Buzz":"";
			String n10 =(i%5==0 && i%3==0)? "Ambos":"";
			
			System.out.println(i +" es :"+n3+n5+n10);
			
			
		}
		
		*/
		
		for (int i = 1; i <100; i++) {
			System.out.println((i%3==0 && i%5==0)? "FizzBuzz":(i%3==0)?"Fizz":(i%5==0)? "Buzz":i);
		}
	}
}
