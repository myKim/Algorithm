package my.baekjoon.q60;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_6030 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		boolean[] pd = new boolean[P+1];
		boolean[] qd = new boolean[Q+1];
		
		for(int i=1; i<pd.length; i++) {
			if(P%i == 0) {
				pd[i] = true;
			}
		}
		for(int i=1; i<qd.length; i++) {
			if(Q%i == 0) {
				qd[i] = true;
			}
		}

		for(int i=1; i<pd.length; i++) {
			if(pd[i]) {
				for(int j=1; j<qd.length; j++) {
					if(qd[j]) {
						bw.write(i + " " + j);
						bw.newLine();
					}
				}
			}
		}
		
		br.close();
		bw.close();
	}
}
