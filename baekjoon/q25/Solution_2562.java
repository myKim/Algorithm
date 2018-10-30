package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2562 {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int maxV = -1;
		int maxI = -1;
		
		for(int i=1; i<=9; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(maxV < N) {
				maxI = i;
				maxV = N;
			}
		}
		
		System.out.println(maxV);
		System.out.println(maxI);
		
		br.close();
	}

}