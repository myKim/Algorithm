package my.baekjoon.q110;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			String cp = st.nextToken();
			
			String tmpStr = str.replace(cp, "");
			int len = (str.length() - tmpStr.length())/cp.length() + tmpStr.length();
			
			
			bw.write(String.valueOf(len));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
