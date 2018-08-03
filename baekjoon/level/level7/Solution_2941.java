package my.level7;

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
		
		int cnt = 0;
		for(int i=0; i<ca.length; i++) {
			while(str.contains(ca[i])) {  // 해당 문자열 존재 시, 글자수 카운트 증가, 해당글자를 " "로 변경 
				cnt++;
				int index = str.indexOf(ca[i]);
				str = new StringBuffer(str).replace(index, index + ca[i].length(), " ").toString();
			}
		}
		cnt += str.replaceAll(" ", "").length();  // 나머지 문자 개수 계산
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();	
	}
}
