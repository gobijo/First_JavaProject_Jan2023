package Day09;

public class program05 {

	public static void main(String[] args) {
		//whileloop();
		//forloop();
		doloop();
	}
		public static void whileloop() {
		int fact=10;
		int x=1;
		int temp=20;
		
		while(x<=fact)
			
		{
			temp=temp*x;
			x++;
		}	
		System.out.println(fact+" "+temp);	
		}

        public static void forloop() {
        	int fact=10;
        	int x=1;
        	long temp=1;
        	for(x=1;x<=fact;x++) {
        		temp=temp*x; //1*1=1; 1*2=2; 2*3=6; 6*4=24; 24*5=120
        	}
        	System.out.println(fact+" "+temp);
        }
        public static void doloop() {
        	int fact=8;
        	int x=1;
        	int temp=1;
        	do {
        		temp=x*temp;
        		x++;
        	}while(x<=fact);
        	System.out.println(fact+" "+temp);

        }

       
}

