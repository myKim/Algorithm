package my.baekjoon.q41;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] s = new int[3];
			for(int i=0; i<s.length; i++) {
				s[i] = Integer.parseInt(st.nextToken());
			}
			
			if(s[0]==0 && s[1]==0 && s[2]==0) break;
			
			bw.write(isRightAngle(s) ? "right" : "wrong");
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static boolean isRightAngle(int[] s) {
		Arrays.sort(s);
		return (s[0]*s[0] + s[1]*s[1]) == s[2]*s[2];
	}

}