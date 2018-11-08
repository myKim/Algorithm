package my.baekjoon.q107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10709 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		char[][] map = new char[H][];
		for(int i=0; i<H; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		int[][] res = new int[H][W];
		for(int[] arr : res ) {
			Arrays.fill(arr, -1);
		}
		for(int i=0; i<H; i++) {
			int cloud = -1;
			for(int j=0; j<W; j++) {
				if(map[i][j] == 'c') {
					cloud = j;
				}
				if(cloud >= 0) {
					res[i][j] = j-cloud;
				}
			}
		}
		
		for(int[] arr : res) {
			for(int i : arr) {
				bw.write(String.valueOf(i) + " ");
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
}
