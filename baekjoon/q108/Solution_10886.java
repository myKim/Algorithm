package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int point = 0;
		for(int i=0; i<N; i++) {
			point += Integer.parseInt(br.readLine());
		}
		
		System.out.print("Junhee is ");
		System.out.print((point > N/2) ? "cute!" : "not cute!");
		
		br.close();
	}

}