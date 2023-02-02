package Day10;//agile fibonacci series

public class Program01 {

	public static void main(String[] args) {
		//whileloop();
		forloop();
		//doloop();
	}
		
		public static void whileloop() {
		int x=0;
		int y=1;
		int a=1;
		while(a<=10)
		{
			System.out.println(x);
		int	z=x+y;
			x=y;
			y=z;
			a++;
		}
		}

			public static void forloop() {
			int x=0;
			int y=1;
			int a=1;
			for(a=1;a<=10;a++)
			{
			System.out.println(x);
			int	z=x+y;
				x=y;
				y=z;
			}
	}
			public static void doloop() {
				int x=0;
				int y=1;
				int a=1;
				do{ 
				
					System.out.println(x);
				int	z=x+y;
					x=y;
					y=z;
					a++;
				}while(a<=10);
				}
					
}
