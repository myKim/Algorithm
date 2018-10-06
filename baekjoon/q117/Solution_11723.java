package my.baekjoon.q117;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11723 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		
		BitCalculator bc = new BitCalculator();
		while(M-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			int x;
			
			switch(cmd) {
			case "add":
				x = Integer.parseInt(st.nextToken());
				bc.add(x);
				break;
			case "remove":
				x = Integer.parseInt(st.nextToken());
				bc.remove(x);
				break;
			case "check":
				x = Integer.parseInt(st.nextToken());
				bw.write(String.valueOf(bc.check(x)));
				bw.newLine();
				break;
			case "toggle":
				x = Integer.parseInt(st.nextToken());
				bc.toggle(x);
				break;
			case "all":
				bc.all();
				break;
			case "empty":
				bc.empty();
				break;
			}
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class BitCalculator {
		int bit;
		
		public BitCalculator() {
			this.bit = 0;
		}
		
		public void add(int x) {
			this.bit |= (1<<(x-1));
		}
		
		public void remove(int x) {
			this.bit &= ~(1<<(x-1));
		}
		
		public int check(int x) {
			return (this.bit & (1<<(x-1))) == 0 ? 0 : 1;
		}
		
		public void toggle(int x) {
			this.bit ^= (1<<(x-1));
		}
		
		public void all() {
			this.bit = (1<<20) - 1;
		}
		
		public void empty() {
			this.bit = 0;
		}
	}
	
}
