package Day02; 

public class Program01 {

	public static void main(String[] args) {
		
		addFunction(25, 45);
		addFunction(150, 350);
        addFunction(475,895);
        addFunction(600,2500);
        addFunction(10.25, 20.15);
        addFunction(1500,2500,5500);
        addFunction(125.2,40.5,70.2);
        
	}

	public static void addFunction(int m,int n) {
		 
		System.out.println(m+n);
		
	}
	
	public static void addFunction(double m, double n) {
	
	System.out.println(m+n);
	
}
	public static void addFunction(int m,int n, int l) {
		 
		System.out.println(m+n+l); 
		
}
	static void addFunction(double m, double n,double l) {
		
		System.out.println(m+n+l);
		
	}
	
}