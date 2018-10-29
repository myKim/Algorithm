package my.baekjoon.q56;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_5671 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		
		while((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			for(int i=N; i<=M; i++) {
				if(!isRepresent(i)) {
					cnt++;
				}
			}
			
			bw.write(String.valueOf(cnt));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static boolean isRepresent(int num) {
		int[] ap = new int[10];
		
		while(num > 0) {
			if(++ap[num%10] > 1) {
				return true;
			}
			num /= 10;
		}
		
		return false;
	}
	
}
