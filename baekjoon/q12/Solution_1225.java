package my.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1225 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] num1 = st.nextToken().toCharArray();
		char[] num2 = st.nextToken().toCharArray();
		
		long res = 0;
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				res += ((num1[i]-'0') * (num2[j]-'0'));
			}
		}
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
}
