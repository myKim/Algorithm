package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1009 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); 
			int b = Integer.parseInt(st.nextToken());
			
			int res = solution(a, b); 
			
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static int solution(int a, int b) {
		int n = b;
		int range = 0;
		a %= 10;
		
		int res = a;
		n--;
		range++;
		
		while(n > 0) {
			res = (res * a) % 10;
			n--;
			range++;
			
			if(res==1 || res==5 || res==6 || res==0) {
				n %= range;
			}
		}
		
		return (res != 0) ? res : 10;
	}

}
