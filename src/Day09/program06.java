package Day09;

public class program06 {

	public static void main(String[] args) {
		doloop();
	}
	public static void forloop() {
		int fact=5;
		int x=1;
		long temp=1;	
		for(x=1; x<=fact; x++)
		{
			temp=temp*x;
					
			System.out.println(x+"  "+temp);			
		}
	}
		public static void whileloop() {
		int fact=5;
		int x=1;
		long temp=1;	
		while(x<=fact)
		{
			temp=temp*x;
		
			
			System.out.println(x+"  "+temp);
			x++;
		}
	}
		public static void doloop() {
			int fact=5;
			int x=1;
			long temp=1;	
			do
			{
				temp=temp*x;
			
				
				System.out.println(x+"  "+temp);
				x++;
      	}while(x<=fact);
		
		}	
		
	}


