package my.level7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1316 {

	public static void main(String[] args) throws IOException {
		// 1. Input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		char[][] str = new char[N][];
				
		for(int i=0; i<N; i++) {
			str[i] = br.readLine().toCharArray();
		}
		
		// 2. Solution
		int cnt = 0;
		for(int i=0; i<N; i++) {
			boolean isGroupWord = true;
			
			for(int j=0; j<str[i].length; j++) {
				// ���� ���ڰ� �ٸ����ڰ� ���ö����� ����
				while(j+1 < str[i].length && str[i][j] == str[i][j+1]) {
					j++;
				}
				
				// �ٴ��� ���ں��� ���� ���ڰ� �ִ��� üũ (�������ڰ� ���� ��� �׷� �ܾ �ƴ�) 
				for(int k=j+2; k<str[i].length; k++) {
					if(str[i][j] == str[i][k]) {
						isGroupWord = false;
						break;
					}
				}
				if(!isGroupWord) {
					break;
				}
			}
			if(isGroupWord) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		
		br.close();
		bw.close();
	}
}
