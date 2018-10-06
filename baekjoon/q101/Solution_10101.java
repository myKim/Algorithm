package my.baekjoon.q101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_10101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] d = new int[3];
		d[0] = Integer.parseInt(br.readLine());
		d[1] = Integer.parseInt(br.readLine());
		d[2] = Integer.parseInt(br.readLine());
		
		bw.write(checkDegree(d));
		
		br.close();
		bw.close();
	}
	
	public static String checkDegree(int[] d) {
		if(d[0] + d[1] + d[2] == 180) {
			if(d[0] == d[1] && d[1] == d[2]) {
				return "Equilateral";
			}
			else if(d[0] == d[1] || d[0] == d[2] || d[1] == d[2]) {
				return "Isosceles";
			}
			else {
				return "Scalene";
			}
		}
		else {
			return "Error";
		}
	}
}
