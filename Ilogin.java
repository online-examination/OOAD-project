package project;

import java.io.IOException;

public interface Ilogin {
	
	Boolean login(String name,String pass) throws IOException;
	void changepass(String name,String pas) throws IOException ;

}
