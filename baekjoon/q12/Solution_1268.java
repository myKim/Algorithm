import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1268 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] data = new int[N][5];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[] cnt = new int[N];
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(i == j) continue;
				
				for(int k=0; k<5; k++) {
					if(data[i][k] == data[j][k]) {
						cnt[i]++;
						cnt[j]++;
						break;
					}
				}
			}
		}
		
		int maxIdx = 0;
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i] > cnt[maxIdx]) {
				maxIdx = i;
			}
		}
		
		System.out.print(maxIdx+1);
		
		br.close();
	}
	
}
