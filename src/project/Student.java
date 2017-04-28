package project;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Ilogin,viewques {
	private Admin admin;
	
	ArrayList pass=new ArrayList();
	ArrayList stu=new ArrayList();
	Scanner psc;
	Scanner ssc;
	BufferedWriter pbw;
	BufferedWriter sbw;
    static	ArrayList answer = new ArrayList();
	public Student() throws IOException
	{
		admin=new Admin();
		psc=new Scanner(new FileReader("Student Login.txt"));
		ssc =new Scanner(new FileReader("Student"));
		
		pbw=new BufferedWriter(new FileWriter("Student Login.txt"));
		sbw=new BufferedWriter(new FileWriter("Student.txt"));
		
	}
	
	@Override
	public Boolean login(String name,String pass)
	{
		return null;
		//login student
	}
	
	@Override
	public String changepass(String name,String pas) throws IOException
	{
		admin.changepasstd(name, pas);
		return null;
	}

	@Override
	public ArrayList quesview() throws IOException {
		// TODO Auto-generated method stub
		ArrayList x=new ArrayList();
		Scanner ax=new Scanner(new FileReader("question.txt"));
		while (ax.hasNextLine()) {
			x.add(ax.nextLine());
		}
		
		return x;
	}
	
	public void ansques(String ans)
	{
		answer.add(ans);
	}
	
	public int chscore()
	{
		return Teacher.score;
	}
	
	
	public void enrol(String name,String fname,String id) throws IOException
	{
		admin.addstudent(name, fname, id);
	}
	
	
}
