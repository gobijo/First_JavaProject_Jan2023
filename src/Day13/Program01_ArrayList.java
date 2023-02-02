package Day13;

import java.util.ArrayList;
import java.util.Arrays;

public class Program01_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<>();
		x.add(50);
		x.add(70);
		x.add(80);
		x.add(95);
		System.out.println(x);
	    x.add(1,60);
	    System.out.println(x);
		x.remove(4);
		System.out.println(x);
		System.out.println(x.size());
		System.out.println(x.contains(70));
		System.out.println(x.contains(200));
		System.out.println(x.isEmpty());
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());
		
	}

}
