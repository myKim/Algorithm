package my.level7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2675 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		int[] R = new int[T];
		char[][] S = new char[T][];
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			R[i] = Integer.parseInt(st.nextToken());
			S[i] = st.nextToken().toCharArray();
		}
		
		// 2. Solution
		for(int i=0; i<T; i++) {
			for(int j=0; j<S[i].length; j++) {
				for(int k=0; k<R[i]; k++) {
					bw.write(S[i][j]);
				}
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
