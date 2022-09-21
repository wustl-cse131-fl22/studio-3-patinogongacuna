package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the biggest number: ");
		int n = in.nextInt();
		boolean[] prime= new boolean[n];
		for(int i = 0; i < n; i++)
		{
			prime[i] = true;
		}//right
		for(int p = 2; p*p <= n; p++)
		{
			if( prime[p] == true)
			{
				for (int i = p * p; i < n; i += p)
				{
					prime[i] = false;
				}
			}
		}
		for(int i = 2; i < n; i++)
		{
			if(prime[i] == true)
			{
				System.out.print(i + " ");
			}
		}
		

	}

}
