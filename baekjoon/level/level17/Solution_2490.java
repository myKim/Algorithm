package my.level17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2490 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 3;
		while(N-- > 0) {
			int[] input = new int[4];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0; i<input.length; i++) {
				input[i]  = Integer.parseInt(st.nextToken());
			}
			
			bw.write(checkResult(input));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static char checkResult(int[] input) {
		int backCnt = 0;
		for(int i=0; i<input.length; i++) {
			if(input[i] == 0) {
				backCnt++;
			}
		}
		
		switch(backCnt) {
		case 1:
			return 'A';
		case 2:
			return 'B';
		case 3:
			return 'C';
		case 4:
			return 'D';
		default:
			return 'E';
		}
	}
}
