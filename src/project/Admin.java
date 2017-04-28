package project;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements Ilogin,Question,viewques {

	Scanner sc ;
	Scanner ssc;
	Scanner tsc;
	Scanner qsc;
	ArrayList pass2=new ArrayList();
	ArrayList pass=new ArrayList();
	ArrayList Stu=new ArrayList();
	ArrayList tea=new ArrayList();
	ArrayList ques=new ArrayList();
	FileWriter fw;
	BufferedWriter qbw;
	FileWriter stufw;
	FileWriter teafw;
	BufferedWriter bw;
	BufferedWriter stubw;
	BufferedWriter teabw;
	//String [] aa;
	 public Admin() throws IOException {
		sc= new Scanner(new FileReader("Admin Login.txt"));
		//sc= new Scanner(new FileReader("Teacher.txt"));
		//sc= new Scanner(new FileReader("Student.txt"));
		//sc= new Scanner(new FileReader("Questions.txt"));
		while (sc.hasNext()) {
			String x=sc.next().toLowerCase();
			pass.add(x);
		}
	/*	while (ssc.hasNext()) {
			String x=ssc.next().toLowerCase();
			Stu.add(x);
		}
		while (tsc.hasNext()) {
			String x=tsc.next().toLowerCase();
			tea.add(x);
		}
		while (qsc.hasNext()) {
			String x=sc.next().toLowerCase();
			ques.add(x);
		}
		*/fw=new FileWriter("Admin Login.txt");
		bw=new BufferedWriter(fw);
		teafw=new FileWriter("Teacher.txt");
		stufw=new FileWriter("Student.txt");
		stubw=new BufferedWriter(stufw);
		teabw=new BufferedWriter(teafw);
		qbw=new BufferedWriter(new FileWriter("Questions.txt"));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Boolean login(String name, String pas) throws IOException {
		// TODO Auto-generated method stub
		boolean x=false;
		for (int i = 0; i < pass.size(); i++)
		{
			if (name.toLowerCase().equals(pass.get(i)) && pas.toLowerCase().equals(pass.get(i+1))) {
				x= true;
			} 
				
			}
			for (int i = 0; i < pass.size(); i+=2)
			{
				bw.write(pass.get(i).toString());
				bw.write(" ");
				bw.write(pass.get(i+1).toString());
				bw.newLine();
			}
			bw.close();
		
			return x;
			
		}
	@Override
	public String changepass(String name,String pas) throws IOException
	{
		boolean x=false;
		for (int i = 0; i < pass.size(); i+=2)
		{
			if (name.toLowerCase().equals(pass.get(i)))
			{
				pass.set(i+1, pas);
				x=true;
			}
			
		}
		
		for (int i = 0; i < pass.size(); i+=2)
		{
			
			String xx=pass.get(i).toString();
			String x2=pass.get(i+1).toString();
			bw.write(xx);
			bw.write(" ");
			bw.write(x2);
			bw.newLine();
			
		}
		
		bw.close();
		
		if (x) {
			return "Password changed successfully";
		}
		
		return "Invalid username";
		
	}
	
	public void addstudent(String name,String fname,String id) throws IOException
	{
		 Stu.add(name);
		 Stu.add(fname);
		 Stu.add(id);
		 stubw.newLine();
		 stubw.write(Stu.get(Stu.size()-3).toString());
		 stubw.write(" ");
		 stubw.write(Stu.get(Stu.size()-2).toString());
		 stubw.write(" ");
		 stubw.write(Stu.get(Stu.size()-1).toString());
		 stubw.close();
	}
	
	public void addteacher(String name,String fname,String id) throws IOException
	{
		 tea.add(name);
		 tea.add(fname);
		 tea.add(id);
		 teabw.newLine();
		 teabw.write(tea.get(tea.size()-3).toString());
		 teabw.write(" ");
		 teabw.write(tea.get(tea.size()-2).toString());
		 teabw.write(" ");
		 teabw.write(tea.get(tea.size()-1).toString());
		 teabw.close();
	}
	
	public int stusearch(String id)
	{
		for (int i = 2; i < Stu.size(); i+=3)
		{
			if (id.equals(Stu.get(i)))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	
	public int teasearch(String id)
	{
		for (int i = 2; i < tea.size(); i+=3)
		{
			if (id.equals(tea.get(i)))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	
	public void delstudent(String id) throws IOException
	{
		int a= stusearch(id);
		Stu.remove(a);
		Stu.remove(a-2);
		Stu.remove(a-1);
		for (int i = 0; i < Stu.size(); i+=3)
		{
			stubw.write(Stu.get(i).toString());
			stubw.write(" ");
			stubw.write(Stu.get(i+1).toString());
			stubw.write(" ");
			stubw.write(Stu.get(i+2).toString());
			stubw.newLine();
		}
		bw.close();
		
	}
	
	public void delteacher(String id) throws IOException
	{
		 int a= stusearch(id);
		 Stu.remove(a);
		 Stu.remove(a-2);
		 Stu.remove(a-1);
		 for (int i = 0; i < tea.size(); i+=3)
			{
				teabw.write(tea.get(i).toString());
				teabw.write(" ");
				teabw.write(tea.get(i+1).toString());
				teabw.write(" ");
				teabw.write(tea.get(i+2).toString());
				teabw.newLine();
			}
		 teabw.close();
	}
	
	
	
	public void changepasstd(String name,String pas) throws IOException
	{
		boolean x=false;
		for (int i = 0; i < pass.size(); i+=2)
		{
			if (name.toLowerCase().equals(pass.get(i)))
			{
				pass.set(i+1, pas);
				x=true;
			}
			
		}
		
		for (int i = 0; i < pass.size(); i+=2)
		{
			
			String xx=pass.get(i).toString();
			String x2=pass.get(i+1).toString();
			bw.write(xx);
			bw.write(" ");
			bw.write(x2);
			bw.newLine();
			
		}
		
		bw.close();
		
		
	}
	
	public void changepastea(String name,String pas) throws IOException
	{
		boolean x=false;
		for (int i = 0; i < pass.size(); i+=2)
		{
			if (name.toLowerCase().equals(pass.get(i)))
			{
				pass.set(i+1, pas);
				x=true;
			}
			
		}
		
		for (int i = 0; i < pass.size(); i+=2)
		{
			
			String xx=pass.get(i).toString();
			String x2=pass.get(i+1).toString();
			bw.write(xx);
			bw.write(" ");
			bw.write(x2);
			bw.newLine();
			
		}
		
		bw.close();
		
	}
	
	@Override
	public void addques()
	{
		
	}
	
	@Override
	public void delques()
	{
		
	}
	
	
	
	@Override
	public void updques()
	{
		
	}

	@Override
	public ArrayList quesview() 
	{
		return null;
		// TODO Auto-generated method stub
		
	}
	
	}


