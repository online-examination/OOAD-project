package project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher implements Ilogin,Question,viewques
{
	static int score=0;
	

	@Override
	public Boolean login(String name, String pass) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changepass(String name, String pas) throws IOException {
		// TODO Auto-generated method stub
		Admin ad=new Admin();
		ad.changepastea(name, pas);
	}
	
	
	@Override
	public ArrayList quesview() throws IOException {
		Student std=new Student();
		return std.quesview();
		
		// TODO Auto-generated method stub
		
	}
	
	
	public void checkans() throws IOException
	{
		Scanner sca=new Scanner(new FileReader("answer.txt"));
		ArrayList a=new ArrayList();
		while (sca.hasNextLine()) {
			a.add(sca.nextLine());
			
		}
		
		for (int i = 0; i < Student.answer.size(); i++) {
			if (Student.answer.get(i).equals(a.get(i)))
			{
				score++;
			}
		}
	}
	
	@Override
	public void addques() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delques() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updques() {
		// TODO Auto-generated method stub
		
	}

	

}
