package my.baekjoon.q16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1673 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			int stp = 0;
			while(n > 0) {
				stp += n;
				cnt += n;
				n = 0;
				
				n += stp / k;
				stp %= k;
			}
			System.out.println(cnt);
		}
		
		br.close();
	}
	
}