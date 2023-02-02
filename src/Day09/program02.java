package Day09;

import java.util.Scanner;

public class program02 {

	public static void main(String[] args){
	
	 Scanner input=new Scanner(System.in);
		System.out.println("enter Table value :- ");
		int tables=input.nextInt();
		input.close();
		int a=1;
		while(a<=20)
		{
			System.out.println(tables+"x"+a+"=");
			a++;
			
		}
	}
    
}
