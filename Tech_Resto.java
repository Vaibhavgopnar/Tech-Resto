package resto_Hotel;

import java.io.IOException;

public class Tech_Resto {

	public static void main(String[] args) throws IOException {

		System.out.println("                      		  *******     					  ");
		System.out.println("     ##... Welcome To Tech-Resto Restorent.com ...## \n");
		try {
			
			LoginMenu l = new LoginMenu();
			l.getLogin();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}