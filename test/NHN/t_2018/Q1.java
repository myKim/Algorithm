package my.nhn.t_2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1 {

	static int[] cards;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		
		initCards(C);
		while(P-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			suffle(N, cards.length);
		}
		
		for(int i=0; i<5; i++) {
			bw.write(String.valueOf(cards[i]));
			if(i!=4) {
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
	
	public static void initCards(int C) {
		cards = new int[C];
		for(int i=0; i<cards.length; i++) {
			cards[i] = i+1;
		}
	}
	
	public static void suffle(int N, int length) { 
		int[] tmp = new int[2 * N];
		for(int i=0; i<N; i++) {
			tmp[i] = cards[i];
		}
		for(int i=0; i<N; i++) {
			tmp[N+i] = cards[length-N+i];
		}
		for(int i=0; i<length-(2*N); i++) {
			cards[i] = cards[i+N];
		}
		for(int i=0; i<tmp.length; i++) {
			cards[length-(2*N)+i] = tmp[i];
		}
		
		if(length-(2*N) > (2*N)) {
			suffle(N, length-(2*N));
		}
	}
	
}
