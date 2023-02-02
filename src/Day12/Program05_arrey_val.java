package Day12;

public class Program05_arrey_val {

	public static void main(String[] args) {
		int x[]= {10,28,67,103,7,51,200,11,40,67,10};
		System.out.println("Even number");
        for(int val:x)
        {
        if(val%2==0)
        {
        System.out.println(val);
        } 
        }
        System.out.println("Odd number");
        for(int val:x)
        {
        if(val%2!=0)
        {
        System.out.println(val);
        }
        }
        System.out.println("show duplicate value" );
        for(int a=0;a<x.length;a++) 
        {
        for(int b=a+1;b<x.length;b++)
        {
        if(x[a]==x[b])
        {
        System.out.println(x[b]);
        }
        }
        }
}
}
