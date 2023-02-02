package Day04;

public class Program01 {

	public static void main(String[] args) {
		int x = add(50, 70);
		int y = add(60, 90);
		long z=add(20,30);
		long a=add(40,80);
		double b=Frac(10.2,30.5);
		double c=Frac(40.5,80.10);
		
		
		System.out.println(x*x);
		System.out.println(y*y);
		System.out.println(z+z);
		System.out.println(z+x);
		System.out.println(a+a);
		System.out.println(b+c);
		System.out.println(b*c);
		System.out.println(x/b);
		System.out.println((x+x)+(y+y));
		System.out.println((x+z)*(b*c));
		System.out.println("day04 task is completed");
		
		 
		
	}
	public static int add(int a, int b) {
		System.out.println(a+b);
	return (a+b);

	}
	public static double Frac(double b, double c) {
		System.out.println(b-c);
		return (b*c);
	

    }
}
