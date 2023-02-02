package Day13;

import java.util.ArrayList;
import java.util.Arrays;

public class Program02_array_collection_list {

	public static void main(String[] args) {
		ArrayList<Integer> x= new ArrayList<>();
        x.add(10);
        x.add(20);
        x.add(40);
        x.add(50);
        Integer[] y= {50,20,60,40,70,80};
        x.addAll(Arrays.asList(y));
        System.out.println(x);
        Integer[] z= {50,20,60,40,70,80};
        x.removeAll(Arrays.asList(z));
        System.out.println(x);

}
}