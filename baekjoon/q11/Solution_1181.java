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
		// ����
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = 0;
				
				if(o1.length() == o2.length()) {
					// str1.toCompare(str2) �޼ҵ带 �̿��ϸ� �ڵ带 �� ���� �� ���� 
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
		String tmpWord = null;  // �ܾ� �ߺ� ��� üũ�� ����
		for(String word : words) {
			if(!word.equals(tmpWord)) {  // ���� �ܾ�� ���� ���� ��츸 ���
				tmpWord = word;
				bw.write(word);
				bw.newLine();;
			}
		}
		
		br.close();
		bw.close();
	}
}
