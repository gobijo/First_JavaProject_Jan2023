package Day14;

import java.util.Arrays;
import java.util.HashMap;

public class Program03_Hashmap {

	public static void main(String[] args) {
	   HashMap<Integer,String> x= new HashMap<>();
	   x.put(101,"aa");
	   x.put(102, "bb");
	   x.put(103, "cc");
	   x.put(104, "bb");
	   x.put(103, "ccc");
	   
	   System.out.println(x);
	   
	   System.out.println(x.size());
	   
	   x.remove(102);
	   System.out.println(x);
	   
	   x.remove(101,"aa");
	   System.out.println(x);
	   
	   System.out.println(x.keySet());
	   System.out.println(x.entrySet());
	   System.out.println(x.values());
	   
	   x.replace(103, "ccc");
	   x.put(105, "ccc");//replace and new key
	   System.out.println(x);
	}

}
