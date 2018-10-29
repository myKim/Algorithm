package my.baekjoon.q46;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_4641 {

	public static final int MAX_VALUE = 100;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		while(!(line = br.readLine()).equals("-1")) {
			bw.write(String.valueOf(solution(line)));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	private static int solution(String line) {
		int res = 0;
		int[] num = new int[MAX_VALUE+1];
		
		StringTokenizer st = new StringTokenizer(line);
		while(st.hasMoreTokens()) {
			num[Integer.parseInt(st.nextToken())]++;
		}
		
		for(int i=1; i<=MAX_VALUE/2; i++) {
			if(num[i] > 0 && num[i*2] > 0) {
				res++;
			}
		}
		
		return res;
	}

}
