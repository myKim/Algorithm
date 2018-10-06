package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10801 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] A = new int[10];
		int[] B = new int[10];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<10; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<10; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		int point = 0;
		for(int i=0; i<10; i++) {
			if(A[i] > B[i]) point++;
			else if(A[i] < B[i]) point--;
		}
		
		String res = null;
		if(point > 0) res = "A";
		else if(point < 0) res = "B";
		else res = "D";
		
		bw.write(res);
		
		br.close();
		bw.close();
	}
	
}
