package my.level10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_4948 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] soe = getSieveOfEratosthenes(123456*2);  // 최대값(123456 * 2) 크기의 소수 목록 생성
		
		int N;
		while((N = Integer.parseInt(br.readLine())) != 0) {
			int cnt = 0;
			for(int i=N+1; i<=2*N; i++) {
				if(soe[i]) {
					cnt++;
				}
			}
			bw.write(String.valueOf(cnt));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	// 에라토스테네스의 체
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
