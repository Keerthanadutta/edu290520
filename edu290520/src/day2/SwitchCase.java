package day2;

public class SwitchCase {

	public static void main(String[] args) {
		
		int num;
		
		num = 4;
		
		switch(num)  {
		case 1: 
	        System.out.println("Monday");
		case 2: 
		    System.out.println("Tuesday");
		case 3: 
		    System.out.println("Wednesday");
		case 4: 
		    System.out.println("Thursday");
		case 5: 
		    System.out.println("Friday");
		case 6: 
		    System.out.println("Saturday");
		case 7: 
		    System.out.println("Sunday");
		    
		break;
		
		default:
		   System.out.println("Invalid day");
		
		 break;
		}	 
	}

}
