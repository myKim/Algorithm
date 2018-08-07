package my.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1929_2 {

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
		boolean[] soe = getSieveOfEratosthenes(N);
		
		for(int i=M; i<=N; i++) {
			if(soe[i]) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static boolean[] getSieveOfEratosthenes(int max) {
		boolean[] soe = new boolean[max + 1];
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
