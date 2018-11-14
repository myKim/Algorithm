package my.baekjoon.q24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		
		while(N-- > 0) {
			int[] arr = new int[3];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			int res = 0;
			if(arr[0]==arr[1] && arr[1]==arr[2]) {
				res = 10000 + arr[0]*1000;
			}
			else if(arr[0]==arr[1] || arr[1]==arr[2]) {
				res = 1000 + arr[1]*100;  // 가운데 숫자는 항상 같은 숫자
			}
			else {
				res = arr[2]*100;
			}
			max = Math.max(max, res);
		}
		
		System.out.print(max);
		
		br.close();
	}
}
