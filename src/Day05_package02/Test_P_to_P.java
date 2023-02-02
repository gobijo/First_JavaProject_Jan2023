package Day05_package02;
import Day05_package01.*;

public class Test_P_to_P extends Test_A {

	public static void main(String[] args) {
		add(15,45);
		mul(10,20);
		//div(100,5); protected type can't work one package to another package.
		//sub(20,40); private type can't work one package to another package.
		
	}

}
