package my.baekjoon.q60;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_6064_1 {

	// 시간 초과 코드
	public static void main(String[] args) throws IOException {
		
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] M = new int[T];
		int[] N = new int[T];
		int[] x = new int[T];
		int[] y = new int[T];
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			M[i] = Integer.parseInt(st.nextToken());
			N[i] = Integer.parseInt(st.nextToken());
			x[i] = Integer.parseInt(st.nextToken()) - 1;  // 인덱스 0부터 시작하기 위해 -1 
			y[i] = Integer.parseInt(st.nextToken()) - 1;  // 인덱스 0부터 시작하기 위해 -1
		}
		
		// 2. Solution
		for(int i=0; i<T; i++) {
			int year = 1;
			int tmpX = 0;
			int tmpY = 0;
			
			while((tmpX != x[i] || tmpY != y[i]) &&  // 해당 년도를 찾을 때 까지
				  (tmpX != M[i]-1 || tmpY != N[i]-1)) {  // 달력의 마지막 년도까지
				tmpX = (tmpX + 1) % M[i];
				tmpY = (tmpY + 1) % N[i];
				year++;
			}
			// 유효한 년도를 찾지 못했을 경우
			if(tmpX != x[i] || tmpY != y[i]) {
				year = -1;
			}
			
			bw.write(String.valueOf(year));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
