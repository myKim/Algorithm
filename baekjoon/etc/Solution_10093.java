package my.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_10093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		
		// 두 수 사이에 있는 수의 개수 출력
		long cnt = max > min ? max - min - 1 : 0; // 주의 : max == min 일 때 0개
		bw.write(cnt + "\n");
		
		// 두 수 사이에 있는 수 출력
		long c = min + 1;
		while(c < max) {
			bw.write((c++) + " ");
		}
		
		br.close();
		bw.close();
	}
	
}
