package Day10;//patten type interloop method

public class program03_test01 {

	public static void main(String[] args) {
		doloop();
	}
		
		public static void forloop() {
		int a=0;
		int b=1;
       for(a=10;a>=1;a--)
       {
       for(b=1;b<=a;b++)
      {
       System.out.print(b);
      }
     System.out.println();
       }
		}

       public static void whileloop() {
    	 int a=0, b;
    	 while(a<=10)
    	 {
    	  b=1;
    	  while(b<=a)
    	 {
    	   System.out.print(b);
    	   b++;
    	 }
    	  System.out.println();
    	  a++;
       } 
       }
    	 public static void doloop() {
    		 int a=0;
    		 do {
    			 int b=1;
    		 do {
    			 System.out.print(b);
    			 b++;
    		 }while(b<=a);
    			 
    			 System.out.println();
    			 a++;
    		 }while(a<=10);
    		 
    	
}      
}
