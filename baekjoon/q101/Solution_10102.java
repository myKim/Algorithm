package my.baekjoon.q101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10102 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int V = Integer.parseInt(br.readLine());
		char[] vote = br.readLine().toCharArray();
		
		int cntA = 0;
		int cntB = 0;
		for(char v : vote) {
			if(v == 'A') cntA++;
			else cntB++;
		}
		
		if(cntA > cntB) bw.write("A");
		else if(cntA < cntB) bw.write("B");
		else bw.write("Tie");
		
		br.close();
		bw.close();
	}
	
}
