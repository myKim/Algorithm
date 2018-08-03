package my.level7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] word = br.readLine().toCharArray();
		
		int result = 0;
		for(int i=0; i<word.length; i++) {
			result += getDialNum(word[i]) + 1; // 숫자 1일때 2초, 그 이상은 1초씩 증가
		}
		
		bw.write(String.valueOf(result));
		
		br.close();
		bw.close();
	}
	
	
	public static int getDialNum(char c) {
		switch(c) {
		case 'A':
		case 'B':
		case 'C':
			return 2;
		case 'D':
		case 'E':
		case 'F':
			return 3;
		case 'G':
		case 'H':
		case 'I':
			return 4;
		case 'J':
		case 'K':
		case 'L':
			return 5;
		case 'M':
		case 'N':
		case 'O':
			return 6;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			return 7;
		case 'T':
		case 'U':
		case 'V':
			return 8;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			return 9;
		default:
			return 1;
		}
	}
}
