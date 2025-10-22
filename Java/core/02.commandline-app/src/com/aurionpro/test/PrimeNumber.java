package com.aurionpro.test;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Prime Number Check");
		int n = 10;
		for (int i=1; i<=n; i++) {
			
			boolean prime = true;
			if(i<2) {
				continue;
			}
			
//			int x= (i/2);
			for(int j=2; j<i; j++) {
				
				if(i%j==0)
					prime = false;
			}
			
			if(prime)
				System.out.println(i);
		}
	}

}


/*int j=2;
while(j <= i) {
	if (!(i%j == 0)) {
		System.out.println(i);
	}
	j++;
}*/