package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		while(B > 0) {
			arr.add(A * (B % 10));
			B /= 10;
		}
		
		int res = 0;
		for(int i=0; i<arr.size(); i++) {
			int tmp = arr.get(i);
			System.out.println(tmp);
			
			for(int j=0; j<i; j++) {
				tmp *= 10;
			}
			res += tmp;
		}
		System.out.println(res);
		
		br.close();
	}
}
