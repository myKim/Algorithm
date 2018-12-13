import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_1099_1 {

	public static final int MAX_LENGTH = 50;	// 단어 글자수 최대 길이
	
	public static ArrayList<char[]>[] words;	// 길이별 단어 리스트
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
			int length = i+1;	// 현재까지 문자열 길이
			
			for(int wordLength=1; wordLength<=length; wordLength++) {
				int dpIdx = length - wordLength - 1;	// 단어 길이에 조합될 dp 인덱스
				
				if(dpIdx >= 0 && dp[dpIdx] == -1) {
					continue;	// 조합될 dp 값이 -1 이면 skip
				}
				
				// 해당 단어길이(wordLength)의 cost 최소값을 구한다.
				char[] subStr = Arrays.copyOfRange(str, length-wordLength, length);
				int curCost = -1;
				for(char[] word : words[wordLength]) {
					int tmp = compareWords(subStr, word);	// 해당 단어의 cost 계산
					if(tmp != -1) {
						curCost = (curCost == -1) ? tmp : Math.min(curCost, tmp);
					}
				}
				if(curCost == -1) {
					continue;	// 해당 단어길이(wordLength)의 단어로 cost를 구할 수 없으면 skip
				}
				
				int minCost = curCost;
				if(dpIdx >= 0) {
					minCost += dp[dpIdx];
				}
				dp[i] = (dp[i] == -1) ? minCost : Math.min(dp[i], minCost);
				
				if(dp[i] == 0) {	// cost의 최소값은 0이므로 0이면 더이상 찾지 않는다.
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
