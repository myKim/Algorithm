package my.nhn.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String cmd = st.nextToken();
		String key = st.nextToken();
		int rot = Integer.parseInt(st.nextToken());
		String str = st.nextToken();
		
		Crypto crypto = new Crypto();
		
		switch(cmd) {
		case "encrypt":
			bw.write(crypto.encrypt(str, key, rot));
			break;
			
		case "decrypt":
			bw.write(crypto.decrypt(str, key, rot));
			break;
		}
		
		br.close();
		bw.close();
	}
	
	
	public static class Crypto {
		
		public Crypto() {}
		
		private String rotate(String str, int rot) {
			char[] arr = str.toCharArray();
			char[] res = new char[arr.length];
			
			for(int i=0; i<arr.length; i++) {
				res[(arr.length + i - rot) % arr.length] = arr[i];
			}
			return String.valueOf(res);
		}
		
		private String calSecKey(String str, String key, boolean isMinus) {
			char[] strArr = str.toCharArray();
			char[] keyArr = key.toCharArray();
			char[] resArr = new char[str.length()];
			
			int minus = isMinus ? -1 : 1;
			
			for(int i=0; i<strArr.length; i++) {
				strArr[i] -= 'a';
				keyArr[i] -= 'a';
				resArr[i] = (char) ((26 + strArr[i] + (minus * (keyArr[i]))) % 26);
				resArr[i] += 'a';
			}
			
			return String.valueOf(resArr);
		}
		
		public String encrypt(String str, String key, int rot) {
			String res = null;
			
			res = calSecKey(str, key, false);
			res = rotate(res, rot);
			
			return String.valueOf(res);
		}
		public String decrypt(String str, String key, int rot) {
			String res = null;
			
			res = rotate(str, -rot);
			res = calSecKey(res, key, true);
			
			return String.valueOf(res);
		}
	}
}
