package project;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Admin ad=new Admin();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String pass=sc.nextLine();
		/*if (ad.login(name, pass)) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login unsuccessful");
		}*/
		System.out.println(ad.changepass(name, pass));
	}

}
