package my.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2775_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] k = new int[T];
		int[] n = new int[T];
		
		for(int i=0; i<T; i++) {
			k[i] = Integer.parseInt(br.readLine());
			n[i] = Integer.parseInt(br.readLine());
		}
		
		int[][] house = new int[15][14];
		for(int i=0; i<house.length; i++) {
			for(int j=0; j<house[0].length; j++) {
				if(i == 0) house[i][j] = j + 1;
				else if(j == 0) house[i][j] = 1;
				else house[i][j] = house[i-1][j] + house[i][j-1];
			}
		}
		
		for(int i=0; i<T; i++) {
			bw.write(String.valueOf(house[k[i]][n[i]-1]));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
