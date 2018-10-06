package my.baekjoon.q100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10040 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] A = new int[N+1];
		int[] B = new int[M+1];
		
		for(int i=1; i<A.length; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		for(int i=1; i<B.length; i++) {
			B[i] = Integer.parseInt(br.readLine());
		}
		
		int[] vote = new int[N+1];
		Arrays.fill(vote, 0);
		
		for(int i=1; i<B.length; i++) {
			for(int j=1; j<A.length; j++) {
				if(B[i] >= A[j]) {
					vote[j]++;
					break;
				}
			}
		}
		
		int maxIdx = 1;
		for(int i=1; i<vote.length; i++) {
			if(vote[maxIdx] < vote[i]) {
				maxIdx = i;
			}
		}
		
		bw.write(String.valueOf(maxIdx));
		
		br.close();
		bw.close();
	}
	
}
