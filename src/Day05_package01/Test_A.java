package Day05_package01;

public class Test_A {

		
		public static void add(int a, int b) {
		System.out.println(a+b);
		
		sub(a,b);// for example -private operation only access to same class
		}
		
		private static void sub(int a, int b) {
			System.out.println(a-b); //private type only work in same class function
			}
		
		protected static void mul(int a, int b) {
			System.out.println(a*b);
			}
		
		 static void div(int a, int b) {
			System.out.println(a*b);
		
		
			

	}

}
