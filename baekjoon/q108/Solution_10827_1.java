package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Solution_10827_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		String res = pow(num, b);
		bw.write(res);
		
		br.close();
		bw.close();
	}
	
	public static String pow(String num, int b) {
		int cnt = 0;
		String str = num;
		
		if(num.indexOf('.') > 0) {
			cnt = num.length()-1 - num.indexOf('.');  // 소수점 자리수
			cnt *= b;
			str = str.replace(".", "");
		}
		
		BigInteger n = new BigInteger(str);
		String tmp = n.pow(b).toString();
		
		StringBuilder sb = new StringBuilder(tmp);
		
		for(int i=tmp.length(); i<cnt+1; i++) {
			sb.insert(0, "0");
		}
		
		if(cnt > 0) {
			sb.insert(sb.length()-cnt, ".");
		}
		return sb.toString();
	}
	
}
