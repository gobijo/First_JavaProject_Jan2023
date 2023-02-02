package Day14;

import java.util.Arrays;
import java.util.HashSet;

public class Program02_Hashset {

	public static void main(String[] args) {
		HashSet<String> x= new HashSet<>();
		x.add("aa");
		x.add("bb");
		x.add("cc");
		x.add("bb");
		x.add("cc");
		x.add("aaa");
		//this method cann't print duplicate value
		System.out.println(x);
		x.remove("aaa");
		System.out.println(x);
		System.out.println(x.size());	
		System.out.println(x.isEmpty());
		System.out.println(x.contains("cc"));
		System.out.println(x.contains("dd"));
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		
		String[]y= {"aa,bb,cc,dd,ee,ff"};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		
		x.removeAll(Arrays.asList(y));
		System.out.println(x);
		
		
	}

}
