package my.nhn.t_2017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1 = Integer.parseInt(st.nextToken());
		int p2 = Integer.parseInt(st.nextToken());
		int p3 = Integer.parseInt(st.nextToken());
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Person> pq = new PriorityQueue<>();
		
		while(N-- > 0) {
			String gender;
			int age;
			String old;
			
			st = new StringTokenizer(br.readLine());
			gender = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			old = st.hasMoreTokens() ? st.nextToken() : "";
			
			pq.offer(new Person(gender, age, old, p1, p2, p3));
		}
		
		while(!pq.isEmpty()) {
			Person person = pq.poll();
			bw.write(person.toString());
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	
	
	
	public static class Person implements Comparable<Person> {
		private int comparePoint;
		String gender;
		int age;
		String old;
		
		
		public Person(String gender, int age, String old, int p1, int p2, int p3) {
			this.gender = gender;
			this.age = age;
			this.old = old;
			
			comparePoint = calComparePoint(gender, age, old, p1, p2, p3);
		}
		
		private int calComparePoint(String gender, int age, String old, int p1, int p2, int p3) {
			int genderPoint = 0;
			int agePoint = 0;
			int oldPoint = 0;
			
			switch(gender) {
			case "F":
				genderPoint = 2;
				break;
			case "M":
				genderPoint = 1;
				break;
			}

			if(age <= 7) {
				agePoint = 1000 - age; 
			}
			else {
				agePoint = age;
			}
			
			switch(old) {
			case "PW":
				oldPoint = 4;
				break;
			case "DP":
				oldPoint = 3;
				break;
			case "P":
				oldPoint = 2;
				break;
			default:
				oldPoint = 1;
				break;
			}
			
			// 가중치 계산
			for(int i=0; i<3-p1; i++) {
				genderPoint *= 1000;
			}
			for(int i=0; i<3-p2; i++) {
				agePoint *= 1000;
			}
			for(int i=0; i<3-p3; i++) {
				oldPoint *= 1000;
			}

			return genderPoint + agePoint + oldPoint;
		}
		
		@Override
		public int compareTo(Person o) {
			return o.comparePoint - this.comparePoint;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(gender).append(" ").append(String.valueOf(age)).append(" ").append(old);
			return sb.toString();
		}
	}
	
}
