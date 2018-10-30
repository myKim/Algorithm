package my.baekjoon.q127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_12790 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int HP = Integer.parseInt(st.nextToken());
			int MP = Integer.parseInt(st.nextToken());
			int AP = Integer.parseInt(st.nextToken());
			int DP = Integer.parseInt(st.nextToken());
			HP += Integer.parseInt(st.nextToken());
			MP += Integer.parseInt(st.nextToken());
			AP += Integer.parseInt(st.nextToken());
			DP += Integer.parseInt(st.nextToken());
			
			HP = (HP < 1) ? 1 : HP;
			MP = (MP < 1) ? 1 : MP;
			AP = (AP < 0) ? 0 : AP;
			
			int BP = 1*HP + 5*MP + 2*AP + 2*DP;
			bw.write(String.valueOf(BP));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
