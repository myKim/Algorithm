package my.baekjoon.q58;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_5800 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			int max = arr[arr.length-1];
			int min = arr[0];
			
			int largestGap = arr[1] - arr[0];
			for(int j=2; j<arr.length; j++) {
				int tmp = arr[j] - arr[j-1];
				largestGap = Math.max(largestGap, tmp);
			}
			
			bw.write("Class " + i);
			bw.newLine();
			bw.write("Max " + max + ", Min " + min + ", Largest gap " + largestGap);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
