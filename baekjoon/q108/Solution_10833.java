package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10833 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sdt = Integer.parseInt(st.nextToken());
			int apl = Integer.parseInt(st.nextToken());
			
			sum += (apl % sdt);
		}
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.close();
	}
	
}
