package my.baekjoon.q27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_2740 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int N, M, K;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[][] B = new int[M][K];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<K; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] res = mul(A, B);
		printMatrix(res);
		
		br.close();
	}
	
	private static int[][] mul(int[][] A, int[][] B) {
		int[][] res = null;
		
		res = new int[A.length][B[0].length];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				for(int k=0; k<B.length; k++) {
					res[i][j] += (A[i][k] * B[k][j]);
				}
			}
		}
		
		return res;
	}
	
	private static void printMatrix(int[][] m) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(j!=0) {
					bw.append(" ");
				}
				bw.append(Integer.toString(m[i][j]));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	
}
