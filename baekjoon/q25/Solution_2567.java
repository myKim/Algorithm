package my.baekjoon.q25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2567 {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		
		int height = 10;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == arr[i-1]) { // 이전 그릇과 같은방향
				height += 5;
			}
			else {
				height += 10;
			}
		}
		
		System.out.print(height);
		
		br.close();
	}

}