package my.kakao.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test_1_Q6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		char[][] b = new char[m][];
		for(int i=0; i<m; i++) {
			b[i] = br.readLine().toCharArray(); 
		}
		
		int res = 0;
		while(enableBreak(b)) {
			res += breakBlock(b);
		}
		
		bw.write(String.valueOf(res));
		
		br.close();
		bw.close();
	}
	
	public static boolean enableBreak(char[][] b) {
		for(int i=0; i<b.length-1; i++) {
			for(int j=0; j<b[i].length-1; j++) {
				char shape = b[i][j];
				if(shape == ' ') continue;
				
				if(shape == b[i][j+1] && shape == b[i+1][j] && shape == b[i+1][j+1]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int breakBlock(char[][] b) {
		int cnt = 0;
		int[][] tmp = new int[b.length][b[0].length];
		for(int i=0; i<tmp.length; i++) {
			Arrays.fill(tmp[i], 0);
		}
		
		for(int i=0; i<b.length-1; i++) {
			for(int j=0; j<b[i].length-1; j++) {
				char shape = b[i][j];
				if(shape == ' ') continue;
				
				if(shape == b[i][j+1] && shape == b[i+1][j] && shape == b[i+1][j+1]) {
					tmp[i][j]++;
					tmp[i][j+1]++;
					tmp[i+1][j]++;
					tmp[i+1][j+1]++;
				}
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(tmp[i][j] > 0) {
					cnt++;
					b[i][j] = ' ';
				}
			}
		}
		
		arrangeBlock(b);
		
		return cnt;
	}
	
	private static void arrangeBlock(char[][] b) {
		for(int j=0; j<b[0].length; j++) {
			for(int i=b.length-1; i>=0; i--) {
				if(b[i][j] != ' ') {
					int nextPos = i + 1;
					while(nextPos < b.length && b[nextPos][j] == ' ') {
						nextPos++;
					}
					
					if(i != (nextPos - 1)) {
						b[nextPos - 1][j] = b[i][j];
						b[i][j] = ' ';
					}					
				}
			}
		}
	}
	
	private static void printBoard(char[][] b) {
		System.out.println();
		for(char[] b2 : b) {
			for(char b3 : b2) {
				System.out.print(b3);
			}
			System.out.println();
		}
	}
	
}
