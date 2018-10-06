package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int mul = A * B * C;
		int[] num = new int[10];
		Arrays.fill(num, 0);
		
		while(mul != 0) {
			num[mul % 10]++;
			mul /= 10;
		}
		
		for(int i=0; i<10; i++) {
			bw.write(String.valueOf(num[i]));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
