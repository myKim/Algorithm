import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2966 {

	public static final char[][] pattern = {{'A','B','C'},
	                                        {'B','A','B','C'},
	                                        {'C','C','A','A','B','B'}};
	public static final int ADRIAN = 0;
	public static final int BRUNO = 1;
	public static final int GORAN = 2;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		char[] answer = br.readLine().toCharArray();
		
		int[] points = new int[3];
		int maxScore = 0;
		
		for(int i=0; i<pattern.length; i++) {
			points[i] = checkAnswer(answer, pattern[i]);
			maxScore = Math.max(maxScore, points[i]);
		}
		
		System.out.println(maxScore);
		for(int i=0; i<points.length; i++) {
			if(points[i] == maxScore) {
				switch(i) {
					case ADRIAN:
						System.out.println("Adrian");
						break;
					case BRUNO:
						System.out.println("Bruno");
						break;
					case GORAN:
						System.out.println("Goran");
						break;
				}
			}
		}
		
		br.close();
	}
	
	public static int checkAnswer(char[] answer, char[] pattern) {
		int cnt = 0;
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == pattern[i % pattern.length]) {
				cnt++;
			}
		}
		return cnt;
	}
}
