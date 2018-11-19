package my.baekjoon.q131;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_13199 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int F = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			int coupon = (M / P) * C;			
			int order = coupon / F;
			coupon = (coupon % F) + (order * C);
			
			// 쿠폰으로 주문한 치킨들의 쿠폰으로 얼마나 주문할 수 있는지 계산 
			int res = 0;
			while(F<=coupon) {
				order = coupon / F;
				coupon = (coupon % F) + (order * C);
				
				res += order;
			}
			
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
