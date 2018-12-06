import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[10][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<dp.length; j++) {
				if(i==0 || j==0) {
					dp[j][i] = 1;
				}
				else {
					dp[j][i] = (dp[j][i-1] + dp[j-1][i]) % 10007;
				}
 			}
		}
		
		int result = 0;
		for(int i=0; i<dp.length; i++) {
			result = (result + dp[i][dp[i].length-1]) % 10007;
		}
		
		System.out.println(result);
		
		
		br.close();
	}
}
