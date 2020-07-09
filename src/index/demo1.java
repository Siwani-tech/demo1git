package index;

import java.util.*;



public class demo1 {
	
		

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		if(prime(n)) {
			System.out.println(n+" an prime no");
		}
		else {
			System.out.println(n+"is not an prime no");
		}
		
		}
	public static boolean prime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
		
		
	}
		
	


	



