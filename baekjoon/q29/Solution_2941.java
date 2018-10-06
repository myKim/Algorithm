package my.baekjoon.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2941 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		// 2. Solution
		String[] ca = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; 
		
		for(int i=0; i<ca.length; i++) {
			str = str.replace(ca[i], " ");
		}
		
		bw.write(String.valueOf(str.length()));
		
		br.close();
		bw.close();	
	}
}
