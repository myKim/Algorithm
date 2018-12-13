import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1099_2 {
	/*********************************************
	 * DFS로 풀이했으나 메모리초과, 시간초과 코드
	 *********************************************/

	public static char[][] words; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toCharArray();
		int N = Integer.parseInt(br.readLine());
		words = new char[N][];
		for(int i=0; i<N; i++) {
			words[i] = br.readLine().toCharArray();
		}
		
		int result = solution(str, 0);
		
		System.out.println(result);
		
		br.close();
	}
	
	public static int solution(char[] str, int startIdx) {
		if(startIdx >= str.length) {
			return 0;
		}
		
		int result = -1;
		for(int i=0; i<words.length; i++) {
			char[] subStr = Arrays.copyOfRange(str, startIdx, startIdx + words[i].length);
			
			int curCost = compareWords(words[i], subStr);
			if(curCost != -1) {
				int remainCost = solution(str, startIdx + words[i].length);
				if(remainCost != -1) {
					int cost = curCost + remainCost;
					
					result = (result != -1) ? Math.min(result, cost) : cost;
				}
			}
		}
		return result;
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
