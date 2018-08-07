package my.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2581_2 {

	public static void main(String[] args) throws IOException {
		/*****************************************
		 * 1. Input
		 *****************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		/*****************************************
		 * 2. Solution
		 *****************************************/
		int min = 10000000;
		int sum = 0;
		
		boolean[] soe = getSieveOfEratosthenes(N);
		
		for(int i=M; i<=N; i++) {
			if(soe[i]) {
				if(min > i) {
					min = i;
				}
				sum += i;
			}
		}
		
		/*****************************************
		 * 3. Output
		 *****************************************/
		if(sum == 0) {
			bw.write(String.valueOf(-1));
			bw.newLine();
		}
		else {
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(min));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	// 에라토스테네스의 채
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
