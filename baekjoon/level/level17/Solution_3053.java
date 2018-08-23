package my.level17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int R = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(String.format("%.6f", func1(R))));
		bw.newLine();
		bw.write(String.valueOf(String.format("%.6f", func2(R))));
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static double func1(int R) {
		return R * R * Math.PI;
	}
	
	public static double func2(int R) {
		return R * R * 2;
	}
}
