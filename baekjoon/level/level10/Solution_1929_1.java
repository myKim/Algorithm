package my.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1929_1 {

	public static void main(String[] args) throws IOException {
		/*****************************************
		 * 1. Input
		 *****************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		/*****************************************
		 * 2. Solution
		 *****************************************/
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
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
