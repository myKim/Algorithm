package my.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2581_1 {

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
		
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) {
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
	
	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		int size = (int) Math.sqrt(n);
		for(int i=2; i<=size; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
