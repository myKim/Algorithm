package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_1919 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] A = br.readLine().toCharArray();
		char[] B = br.readLine().toCharArray();
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int i = 0, j = 0;
		int cnt = 0;
		while(i<A.length && j<B.length) {
			if(A[i] > B[j]) {
				j++;
				cnt++;
			}
			else if(A[i] < B[j]) {
				i++;
				cnt++;
			}
			else {
				i++;
				j++;
			}
		}
		if(i < A.length) {
			cnt += (A.length - i);
		}
		if(j < B.length) {
			cnt += (B.length - j);
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}