package my.baekjoon.q11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_1181 {

	public static void main(String[] args) throws IOException {
		/*****************************************
		 * 1. Input
		 *****************************************/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		for(int i=0; i<N; i++) {
			words[i] = br.readLine();
		}
		
		/*****************************************
		 * 2. Solution
		 *****************************************/
		// 정렬
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = 0;
				
				if(o1.length() == o2.length()) {
					// str1.toCompare(str2) 메소드를 이용하면 코드를 더 줄일 수 있음 
					for(int i=0; i<o1.length(); i++) {
						if(o1.charAt(i) != o2.charAt(i)) {
							result = o1.charAt(i) - o2.charAt(i);
							break;
						}
					}
				}
				else {
					result = o1.length() - o2.length();
				}
				return result;
			}
		});
		
		/*****************************************
		 * 3. Output
		 *****************************************/
		String tmpWord = null;  // 단어 중복 출력 체크용 변수
		for(String word : words) {
			if(!word.equals(tmpWord)) {  // 이전 단어와 같지 않을 경우만 출력
				tmpWord = word;
				bw.write(word);
				bw.newLine();;
			}
		}
		
		br.close();
		bw.close();
	}
}
