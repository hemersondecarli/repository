package Learning;

public class LargestNumber {

	public static void main(String[] args) {
		int [] numbers = {5, 12, 3, 20, 8};

		int currentNumber = 0;
	
		for (int i = 0; i<numbers.length; i++) {
		
			if(currentNumber < numbers[i]) {
				 currentNumber = numbers[i];
				
			}else {
				
			}
		}
		System.out.println(currentNumber);
	}

}
