package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_1038 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		long res = 0;
		while(N-- > 0) {
			res = nextDecreaseNum(res);
		}
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	
	public static long nextDecreaseNum(long num) {
		if(num < 0) { return -1; } // 중요 1022 번째에서 9876543210 이 된다.
		
		num++;
		int len = ((Long) num).toString().length();
		int[] arr = new int[len+1];
		Arrays.fill(arr, 0);
		
		int k = 0;
		while(num > 0) {
			arr[k++] = (int) (num % 10);
			num /= 10;
		}
		
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i] < arr[i+1]) { break; }
			
			arr[i] = i;
			arr[i+1]++;
			
			if(arr[i+1] > 9) { // 자리수 증가
				arr[i+1] = i+1;
				arr[i+2] = i+2;
				
				if(arr[i+2] > 9) {
					return -1;
				}
			}
		}
		
		long res = 0;
		for(int i=arr.length-1; i>=0; i--) {
			res = res * 10 + arr[i];
		}
		return res;
	}
	
	
	public static boolean isDecreaseNum(int n) {
		int num1, num2;
		
		num1 = n % 10;
		n /= 10;
		while(n > 0) {
			num2 = n % 10;
			n /= 10;
			
			if(num1 >= num2) {
				return false;
			}
			num1 = num2;
		}
		return true;
	}
	
}
