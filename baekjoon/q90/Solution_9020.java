package my.baekjoon.q90;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_9020 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		boolean[] soe = getSieveOfEratosthenes(10000);
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			int num1 = 0;
			int num2 = 0;
			
			for(int j=2; j<=n/2; j++) {
				if(soe[j] && soe[n-j]) {
					num1 = j;
					num2 = n-j;
				}
			}
			bw.write(String.valueOf(num1));
			bw.write(" ");
			bw.write(String.valueOf(num2));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static boolean[] getSieveOfEratosthenes(int max) {
		boolean[] soe = new boolean[max+1];
		Arrays.fill(soe, true);
		soe[0] = false;
		soe[1] = false;
		
		int prime = 2;
		int size = (int) Math.sqrt(max);
		while(prime <= size) {
			if(soe[prime]) {
				for(int i=prime*prime; i<=max; i+=prime) {
					soe[i] = false;
				}
			}
			prime++;
		}
		
		return soe;
	}
}
