package my.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Solution_5635 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Person[] p = new Person[n];
		
		for(int i=0; i<p.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int day = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			
			Person person = new Person(name, year, month, day);
			p[i] = person;
		}
		Arrays.sort(p);
		
		System.out.println(p[p.length-1].name);
		System.out.println(p[0].name);
		
		br.close();
	}
	
	public static class Person implements Comparable<Person> {
		String name;
		Calendar birthday;
		
		public Person(String name, int bYear, int bMonth, int bDay) {
			this.name = name;
			this.birthday = Calendar.getInstance();
			this.birthday.set(bYear, bMonth, bDay);
		}
		
		@Override
		public int compareTo(Person person) {
			return birthday.compareTo(person.birthday);
		}
	}
	
}
