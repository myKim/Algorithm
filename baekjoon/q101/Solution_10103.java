package my.baekjoon.q101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10103 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int scoreA = 100;
		int scoreB = 100;
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A > B) {
				scoreB -= A;
			}
			else if(A < B) {
				scoreA -= B;
			}
		}
		
		System.out.println(scoreA);
		System.out.println(scoreB);
		
		br.close();
	}
	
}
