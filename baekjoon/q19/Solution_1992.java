package my.baekjoon.q19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_1992 {

	public static void main(String[] args) throws IOException {
		IO io = IO.getInstance();
		
		int N = Integer.parseInt(io.br.readLine());
		char[][] matrix = new char[N][];
		for(int i=0; i<N; i++) {
			matrix[i] = io.br.readLine().toCharArray();
		}
		
		compress(matrix, 0, 0, N);
		io.close();
	}

	private static void compress(char[][] matrix, int x, int y, int size) throws IOException {
		// 모두 같은 색상일 경우
		if(isEnableCompression(matrix, x, y, size)) {
			IO.getInstance().bw.write(matrix[x][y]);
			return;
		}
		
		// 같은 색상이 아닐 경우 4분할로 압축
		IO.getInstance().bw.write("(");
		int newSize = size / 2;
		compress(matrix, x, y, newSize);
		compress(matrix, x, y + newSize, newSize);
		compress(matrix, x + newSize, y, newSize);
		compress(matrix, x + newSize, y + newSize, newSize);
		IO.getInstance().bw.write(")");
	}
	
	private static boolean isEnableCompression(char[][] matrix, int x, int y, int size) {
		if(matrix == null || matrix[0] == null) {
			return false;
		}
		
		char c = matrix[x][y];
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				if(matrix[i][j] != c) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static class IO {
		
		private static IO _IO;
		public BufferedReader br;
		public BufferedWriter bw;
		
		private IO() {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}
		
		public static IO getInstance() {
			if(_IO == null) {
				_IO = new IO();
			}
			return _IO;
		}
		
		public void close() throws IOException {
			if(br != null) {
				br.close();
			}
			if(bw != null) {
				bw.flush();
				bw.close();
			}
			_IO = null;
		}
	}	
}
