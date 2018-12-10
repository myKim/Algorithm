import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] ropes = new int[N];
		for(int i=0; i<N; i++) {
			ropes[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(ropes);
		int max = 0;
		for(int i=0; i<N; i++) {
			max = Math.max(max, ropes[i] * (N-i));
		}
		
		System.out.print(max);
		
		br.close();
	}
	
}
