package day2;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		
		int firstnum, secondnum, thirdnum ;
		
		firstnum = 90;
		secondnum = 79;
		thirdnum = 80;
		
		if (firstnum > secondnum && firstnum > thirdnum)  {
			System.out.println("First Number is Greatest");
			
		}	else if (secondnum > firstnum && secondnum > thirdnum) {
			System.out.println("Second Number is Greatest");
		}   else if (thirdnum > firstnum && thirdnum > secondnum)   {
			System.out.println("Third Number is Greatest");
		}   else {
			System.out.println("All three are Equal");
		}
	      

	}

}
