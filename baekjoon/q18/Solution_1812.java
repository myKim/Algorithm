package my.baekjoon.q18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i]; // (2a + 2b + 2c ...)
		}
		sum /= 2;  // (2a + 2b + 2c ...) ¡æ (a + b + c ...)
		
		for(int i=0; i<N; i++) {
			int tmp = 0;
			
			for(int j=0; j<N; j+=2) {
				tmp += arr[(i+j) % N]; // (2a + b + c ...)
			}
			bw.write(String.valueOf(tmp - sum));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}