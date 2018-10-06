package my.baekjoon.q108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_10825 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		PriorityQueue<Student> pq = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mat = Integer.parseInt(st.nextToken());
			
			pq.offer(new Student(name, kor, eng, mat));
		}
		
		while(!pq.isEmpty()) {
			bw.write(pq.poll().name);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	public static class Student implements Comparable<Student> {
		String name;
		int kor;
		int eng;
		int mat;
		
		public Student(String name, int kor, int eng, int mat) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}

		@Override
		public int compareTo(Student s) {
			if(kor > s.kor) {
				return -1;  // 국어 내림차순
			}
			else if(kor < s.kor) {
				return 1;
			}
			else {
				if(eng > s.eng) {
					return 1;  // 영어 오름차순
				}
				else if(eng < s.eng) {
					return -1;
				}
				else {
					if(mat > s.mat) {
						return -1;  // 수학 내림차순
					}
					else if(mat < s.mat) {
						return 1;
					}
					else {
						return name.compareTo(s.name);  // 사전순 오름차순
					}
				}
			}
		}
	}
	
}
