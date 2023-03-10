package resto_Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LoginMenu extends Set {

	public void getLogin() throws Exception, IOException {
		int choice = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> data = new HashMap<String, String>();
		
		try {
			OptionsMenu o = new OptionsMenu();
			ProductMenu pm = new ProductMenu();
			while(true) {
				System.out.println("Please Login\n");

				System.out.println("1.   Gmail						3. Username");
				System.out.println("2.   Phone 					4. Guest");
	
				System.out.println("		5.   Create New Account");
				System.out.println("\n0.   Exit");
				System.out.println("Please select Login option ....");
				choice = Integer.parseInt(br.readLine());

				switch (choice) {
				case 1:
					try {
						data.put("vaibhav123@gmail.com", "987089");
						System.out.println("Enter Email ID");
						setEmail(br.readLine());

						System.out.println("Enter Your Password");
						setPass(br.readLine());

						System.out.println("Enter Your Address");
						setAddress(br.readLine());
					} catch (Exception e) {
						System.out.println("Invalid Pattern ");
					}

					String cn = getEmail();
					String pn = getPass();
					String an = getAddress();

					if (data.containsKey(cn) && data.get(cn) == pn) {
						Set s = new Set(cn, pn, an);
						Set.Insert(s);
						s.setCustomer(cn);
						o.getOptionMenu(s);

					} else
						System.out.println("Invalid Emailid or Password");

					break;

				case 2:
					System.out.println("Enter Phone Number");
					try {
						Long n = setPhoneno(Long.parseLong(br.readLine()));
						String s1 = Long.toString((long) n);
						System.out.println("Enter Your Address");
						setAddress(br.readLine());
						String p = "";
						an = getAddress();
						if (s1.length() == 10) {					
							Set s = new Set(s1,p,an);
							Set.Insert(s);
							s.setCustomer(s1);
							o.getOptionMenu(s);
						} else
							System.out.println("Invalid Phone Number \n");
					} catch (NumberFormatException e) {
						System.out.println("!....... Phone Number Must Numbers Only .....!! ");
					}
					break;
				case 3:
					data.put("vaibhav", "321432");
					System.out.println("Enter Username ");
					setUser(br.readLine());

					System.out.println("Enter password");
					setPass(br.readLine());

					System.out.println("Enter Your Address");
					setAddress(br.readLine());

					String u = getUser();
					String p = getPass();
					an = getAddress();
					setCustomer(u);
					if (data.containsKey(u) && data.get(u) == p) {
						Set s = new Set(u, p, an);
						Set.Insert(s);
						s.setCustomer(u);
						o.getOptionMenu(s);
					} else
						System.out.println("\n" + "Invalid Username or Password" + "\n");
					break;
				case 4:
					String s1 = "Guest";
					p = "";
					System.out.println("Enter Your Address");
					setAddress(br.readLine());
					an = getAddress();
					Set s = new Set(s1, p, an);
					Set.Insert(s);
					s.setCustomer(s1);
					pm.getProductMenu(s1);
					break;

				case 5:
					System.out.println("Enter Email ID");
					setEmail(br.readLine());
					
					System.out.println("Enter Your Password");
					setPass(br.readLine());

					System.out.println("Enter Your Address");
					setAddress(br.readLine());
					String c = getEmail();
					p = getPass();
					an = getAddress();
					 s = new Set(c, p, an);
					Set.Insert(s);
					s.setCustomer(c);
					o.getOptionMenu(s);

					break;
				case 0:
					System.out.println("...Thank You For Visiting Tech-Resto Restorent App ...");
					System.out.println("                	  ..... Visit Again .....\n");
					break;

				default:
					System.out.println("Invalid Option, Entered Valid Option ..");
					break;
				}
				break;
			} 
		} catch (Exception e) {

			System.out.println("Enter Numbers Only ...............!!");
			System.out.println("Login again .....!");
			e.printStackTrace();
		}

	}
}
