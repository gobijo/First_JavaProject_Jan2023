package Day07;//switch type

public class Program02 {

	public static void main(String[]args) {
		String x="DAY_03";
		
		switch(x) {
		case "Day_01" :
			System.out.println("MON");
			break;
		case "DAY_02" :
			System.out.println("TUE");
			break;
		case "DAY_03" :
				System.out.println("WED");
			break;
		case "DAY_04" :
				System.out.println("THUS");
			break;
		case "DAY_05" :
				System.out.println("FRI");
			break;
		case "DAY_06" :
					System.out.println("SAT");
			break;	
		case "DAY_07" :
					System.out.println("SUN");
			break;	
		default :
		    	 System.out.println("invalid selection");
		     break;
		}	
					
	
		
		}
	}