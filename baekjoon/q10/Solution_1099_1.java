import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_1099_1 {

	public static final int MAX_LENGTH = 50;	// �ܾ� ���ڼ� �ִ� ����
	
	public static ArrayList<char[]>[] words;	// ���̺� �ܾ� ����Ʈ
	public static int[] dp;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toCharArray();
		
		words = new ArrayList[MAX_LENGTH + 1];
		for(int i=0; i<words.length; i++) {
			words[i] = new ArrayList<>();
		}
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			char[] word = br.readLine().toCharArray();
			int length = word.length;
			
			words[length].add(word);
		}
		
		solution(str);
		
		System.out.println(dp[dp.length-1]);
		
		br.close();
	}
	
	public static void solution(char[] str) {
		dp = new int[str.length];
		Arrays.fill(dp, -1);
		
		for(int i=0; i<str.length; i++) {
			int length = i+1;	// ������� ���ڿ� ����
			
			for(int wordLength=1; wordLength<=length; wordLength++) {
				int dpIdx = length - wordLength - 1;	// �ܾ� ���̿� ���յ� dp �ε���
				
				if(dpIdx >= 0 && dp[dpIdx] == -1) {
					continue;	// ���յ� dp ���� -1 �̸� skip
				}
				
				// �ش� �ܾ����(wordLength)�� cost �ּҰ��� ���Ѵ�.
				char[] subStr = Arrays.copyOfRange(str, length-wordLength, length);
				int curCost = -1;
				for(char[] word : words[wordLength]) {
					int tmp = compareWords(subStr, word);	// �ش� �ܾ��� cost ���
					if(tmp != -1) {
						curCost = (curCost == -1) ? tmp : Math.min(curCost, tmp);
					}
				}
				if(curCost == -1) {
					continue;	// �ش� �ܾ����(wordLength)�� �ܾ�� cost�� ���� �� ������ skip
				}
				
				int minCost = curCost;
				if(dpIdx >= 0) {
					minCost += dp[dpIdx];
				}
				dp[i] = (dp[i] == -1) ? minCost : Math.min(dp[i], minCost);
				
				if(dp[i] == 0) {	// cost�� �ּҰ��� 0�̹Ƿ� 0�̸� ���̻� ã�� �ʴ´�.
					break;
				}
			}
		}
	}
	
	public static int compareWords(char[] wordA, char[] wordB) {
		char[] tmpA = wordA.clone();
		char[] tmpB = wordB.clone();
		
		Arrays.sort(tmpA);
		Arrays.sort(tmpB);
		
		for(int i=0; i<tmpA.length; i++) {
			if(tmpA[i] != tmpB[i]) {
				return -1;
			}
		}
		
		int cost = 0;
		for(int i=0; i<tmpA.length; i++) {
			if(wordA[i] != wordB[i]) {
				cost++;
			}
		}
		return cost;
	}
	
}
