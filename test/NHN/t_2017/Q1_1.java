package my.nhn.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1_1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Integer> bag = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int input = Integer.parseInt(st.nextToken());
			
			if(bag.size() >= 3) {
				if(bag.contains(input)) {
					bag.remove(bag.indexOf(input));
				}
				else {
					res.add(bag.remove(0));
				}
			}
			bag.add(input);
		}
		
		if(res.size() > 0) {
			for(int i=0; i<res.size(); i++) {
				if(i != 0) {
					bw.newLine();
				}
				bw.write(String.valueOf(res.get(i)));
			}
		}
		else {
			bw.write('0');
		}
		
		br.close();
		bw.close();
	}
}
