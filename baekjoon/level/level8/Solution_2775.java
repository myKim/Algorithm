package my.level8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2775 {

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
		
		for(int i=0; i<T; i++) {
			int[][] house = new int[k[i]+1][n[i]];
			
			for(int j=0; j<house.length; j++) {
				house[j][0] = 1;
			}
			for(int j=0; j<house[0].length; j++) {
				house[0][j] = j+1;
			}
			
			for(int j=1; j<house.length; j++) {
				for(int m=1; m<house[0].length; m++) {
					house[j][m] = house[j-1][m] + house[j][m-1];
				}
			}
			
			bw.write(String.valueOf(house[k[i]][n[i]-1]));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
