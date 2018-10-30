package my.baekjoon.q30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_3034 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		while(N-- > 0) {
			int len = Integer.parseInt(br.readLine());
			bw.write(isRange(W, H, len) ? "DA" : "NE");
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
	
	public static boolean isRange(int W, int H, int len) {
		return (len*len) <= (W*W) + (H*H);
	}
	
}