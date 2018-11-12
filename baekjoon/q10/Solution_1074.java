package my.baekjoon.q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1074 {
	
	static int N;
	static int r;
	static int c;
	static int res;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		solution(N, 0, 0, 0);
		
		System.out.print(res);
		
		br.close();
	}
	
	
	public static void solution(int N, int x, int y, int start) {
		if(x==r && y==c) {
			res = start;
			return;
		}
		if(N==0) {
			return;
		}
		
		int tmp = (int)Math.pow(2, N-1);
		int subCnt = tmp*tmp;

		if((x<=r && r<x+tmp) && (y<=c && c<y+tmp)) {
			solution(N-1, x, y, start);			
		}
		if((x<=r && r<x+tmp) && (y+tmp<=c && c<y+tmp*2)) {
			solution(N-1, x, y+tmp, start+subCnt*1);
		}
		if((x+tmp<=r && r<x+tmp*2) && (y<=c && c<y+tmp)) {
			solution(N-1, x+tmp, y, start+subCnt*2);
		}
		if((x+tmp<=r && r<x+tmp*2) && (y+tmp<=c && c<y+tmp*2)) {
			solution(N-1, x+tmp, y+tmp, start+subCnt*3);
		}
	}
	
}
