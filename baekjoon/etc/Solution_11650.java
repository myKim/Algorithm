package my.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Pair[] pairs = new Pair[N];
		for(int i=0; i<pairs.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			pairs[i] = new Pair(x, y);
		}
		
		// 정렬
		Arrays.sort(pairs);
		
		// 출력
		for(Pair pair : pairs) {
			bw.write(pair.x + " " + pair.y);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static class Pair implements Comparable<Pair> {
		int x;
		int y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			return this.x != o.x ? this.x - o.x : this.y - o.y;
		}
	}
}
