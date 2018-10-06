package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = 7;
		int sum = 0;
		int min = 100;
		while(N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if((num & 1) != 0) { // 비트연산으로 홀수 확인
				min = Math.min(min, num);
				sum += num;
			}
		}
		if(sum == 0) {
			bw.write("-1");
		}
		else {
			bw.write(sum + "\n");
			bw.write(min + "\n");
		}
		
		br.close();
		bw.close();
	}
}