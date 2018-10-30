package my.baekjoon.q66;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_6679_2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1000; i<10000; i++) {
			int sum1, sum2;
			sum1 = getSum(i, 10);
			sum2 = getSum(i, 12);
			if(sum1 != sum2) continue;
			
			sum2 = getSum(i, 16);
			if(sum1 != sum2) continue;
			
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		
		bw.close();
	}
	
	public static int getSum(int N, int radix) {
		int sum = 0;
		while(N > 0) {
			sum += N % radix;
			N /= radix;
		}
		return sum;
	}
	
}
