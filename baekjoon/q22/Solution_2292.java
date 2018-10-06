package my.baekjoon.q22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(getLevel(N)));
		
		br.close();
		bw.close();
	}
	
	
	public static int getLevel(int room) {
		int level = 1;
		int maxRoomNum = 1;
		
		while(maxRoomNum < room) {
			maxRoomNum += (level * 6);
			level++;
		}
		return level;
	}
}
