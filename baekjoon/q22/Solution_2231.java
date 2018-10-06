package my.baekjoon.q22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		int start = N/10 > 0 ? N/10 : 1;
		
		for(int i=start; i<N; i++) {
			int num = i;
			int sum = num;
			
			while(num > 0) {
				sum += (num % 10);
				num /= 10;
			}
			
			if(sum == N) {
				res = i;
				break;
			}
		}
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
}
