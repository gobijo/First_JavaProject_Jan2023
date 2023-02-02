package Day09;

import java.util.Scanner;

public class Program03 {

		public static void main(String[] args){
			doloop();
			
		}
			
		public static void whileloop() {
		 Scanner input=new Scanner(System.in);
		 System.out.println("enter Table value :- ");
				int tables=input.nextInt();
				input.close();
				int a=1;
				while(a<=10)
				{
					System.out.println(tables+"x"+a+"="+tables*a);
					a++;					
			}
		}
		
		public static void doloop() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter Table value :- ");
		int tables=input.nextInt();
		input.close();
		int a=1;
		do {
			System.out.println(tables+"x"+a+"="+tables*a);
			a++;
		} while(a<=10);
	}
		
		public static void forloop() {
			Scanner input=new Scanner(System.in);
			System.out.println("enter Table value :-");
			int tables=input.nextInt();
			input.close();
		 for(int a=1;a<=10;a++)
		 {
			 System.out.println(tables+"x"+a+"="+tables*a);
		 }
						
		}
		
		
}

