package my.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2028 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			int tmp = 1;
			while((N/tmp) > 0) {
				tmp *= 10;
			}
			
			if(N == (N*N)%tmp) {
				bw.write("YES");
			}
			else {
				bw.write("NO");
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}
