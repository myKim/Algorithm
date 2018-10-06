package my.baekjoon.q55;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5555 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		while(N-- > 0) {
			String ring = br.readLine();
			ring = ring.concat(ring);
			if(ring.contains(str)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	
}