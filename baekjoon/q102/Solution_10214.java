package my.baekjoon.q102;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10214 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int Y = 0;
			int K = 0;
			
			for(int i=0; i<9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				Y += Integer.parseInt(st.nextToken());
				K += Integer.parseInt(st.nextToken());
			}
			
			String res = null;
			if(Y > K) {
				res = "Yonsei";
			}
			else if(Y < K) {
				res = "Korea";
			}
			else {
				res = "Draw";
			}
			bw.write(res);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
}
