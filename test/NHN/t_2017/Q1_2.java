package my.nhn.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> rmList = new ArrayList<>();
		
		NhnAdv game = new NhnAdv(3);
		
		while(st.hasMoreTokens()) {
			int item = Integer.parseInt(st.nextToken());
			
			int rm = game.put(item);
			if(rm != 0) {
				rmList.add(rm);
			}
		}
		
		if(rmList.size() > 0) {
			for(int i : rmList) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		else {
			bw.write(String.valueOf(0));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class NhnAdv {
		
		ArrayList<Integer> bag;
		final int maxSize;
		
		public NhnAdv(int maxSize) {
			this.maxSize = maxSize;
			this.bag = new ArrayList<>();
		}
		
		public int put(int n) {
			int rm = 0;
			
			if(bag.size() >= maxSize) {
				if(!bag.contains(n)) {
					rm = bag.remove(0); 
				}
				else {
					bag.remove(bag.indexOf(n));
				}
				bag.add(n);
			}
			else {
				bag.add(n);
			}
			
			return rm;
		}
	}
}
