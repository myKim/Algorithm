package my.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] input = br.readLine().toCharArray();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += (input[i] - '0');
		}
		System.out.println(sum);
		
		br.close();
	}

}
