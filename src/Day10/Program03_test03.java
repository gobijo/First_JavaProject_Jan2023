package Day10;

public class Program03_test03 {

	public static void main(String[] args) {
		int a=5;
		do {
			int b=5;
		do {
			System.out.print(b);
			b--;
		}while(b>=a);		
			System.out.println();
			a--;
		}while(a>=1);
	}

}
