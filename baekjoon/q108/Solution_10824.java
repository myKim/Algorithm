package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(new StringBuilder().append(st.nextToken()).append(st.nextToken()).toString());
		long B = Long.parseLong(new StringBuilder().append(st.nextToken()).append(st.nextToken()).toString());
		long res = A + B;
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
}
