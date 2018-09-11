package my.level5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_4673 {

	public static void main(String[] args) throws IOException {
		int[] array = new int[10001];
		Arrays.fill(array, 0);
		
		for(int i=1; i<=10000; i++) {
			int num = func(i);
			if(num >= array.length) {
				continue;
			}
			else {
				array[num]++;
			}
		}

		// 결과 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1; i<=10000; i++) {
			if(array[i] == 0) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.close();
	}

	public static int func(int num) {
		int tmp = num;
		int sum = 0;
		
		while(tmp != 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		return num + sum;
	}
}
