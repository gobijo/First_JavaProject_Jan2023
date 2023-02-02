package Day12;

public class Program07_array {

	public static void main(String[] args) {

	        int [] y= {1, 40,20,30,103,101,40,1,30,7,103,65};
			
			System.out.println("Duplicate elements in the array");
			for(int i=0;i<y.length;i++)
			{
			for (int j=i+1;j<y.length;j++)
			{
			if( y[i]==y[j])
			System.out.println(y[j]);
			}
			}
}
}

		