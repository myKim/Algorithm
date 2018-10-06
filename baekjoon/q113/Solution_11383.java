package my.baekjoon.q113;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_11383 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] img1 = new char[N][M];
		char[][] img2 = new char[N][2*M];
		
		for(int i=0; i<img1.length; i++) {
			img1[i] = br.readLine().toCharArray();
		}
		for(int i=0; i<img2.length; i++) {
			img2[i] = br.readLine().toCharArray();
		}
		
		boolean res = true;
		for(int i=0; i<img1.length; i++) {
			for(int j=0; j<img1[i].length; j++) {
				if(img1[i][j] != img2[i][j*2] || img1[i][j] != img2[i][j*2+1]) {
					res = false;
					break;
				}
			}
		}
		
		if(res) {
			bw.write("Eyfa");
		}
		else {
			bw.write("Not Eyfa");
		}
		
		br.close();
		bw.close();
	}
	
}