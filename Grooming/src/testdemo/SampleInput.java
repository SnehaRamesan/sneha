package testdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SampleInput {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name");
			String name =br.readLine();
			System.out.println("Enter your college name");
			String collname =br.readLine();
			System.out.println(name+" "+collname);
		} catch (Exception e) {
		}

	}

}
