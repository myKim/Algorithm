package my.baekjoon.q28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2804 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] A = st.nextToken().toCharArray();
		char[] B = st.nextToken().toCharArray();
		
		// 교차 인덱스 찾기
		int idxA = -1;
		int idxB = -1;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B.length; j++) {
				if(A[i] == B[j]) {
					idxA = i;
					idxB = j;
					break;
				}
			}
			if(idxA > 0 || idxB >0) {
				break;
			}
		}
		
		// 크로스워드 그리기
		char[][] grid = new char[B.length][A.length];
		for(char[] line : grid) {
			Arrays.fill(line, '.');
		}
		
		for(int i=0; i<A.length; i++) {
			grid[idxB][i] = A[i];
		}
		for(int i=0; i<B.length; i++) {
			grid[i][idxA] = B[i];
		}

		// 출력
		for(char[] line : grid) {
			for(char c : line) {
				bw.write(c);
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}