package resto_Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class OptionsMenu extends Set {

	Scanner sc = new Scanner(System.in);

	public void getOptionMenu(Set s) throws Exception {
		LoginMenu l = new LoginMenu();
		ProductMenu pm = new ProductMenu();
		while (true) {
			System.out.println("\n			OPTIONS 					");
			System.out.println("1.  Menu");
			System.out.println("2.  Your Details");
			System.out.println("3.  Your Orders");
			System.out.println("4.  Refund Item");
			System.out.println("5.  Exit");
			System.out.println("Select Your Option");

			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				pm.getProductMenu(s.getCustomer());
				break;

			case 2:
				Connection con = DatabaseConn.creatC();
				String uid = s.getCustomer();
				String query = " select * from Resto JOIN Productdata ON Resto.ID_No = Productdata.ID_No where Customer_ID='"+uid+"' ";
				PreparedStatement ps = con.prepareStatement(query);

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					System.out.println("*************************************************");
					System.out.println("ID No : " + rs.getInt(1));
					System.out.println("Customer ID : " + rs.getString(2));
					System.out.println("Password : " + rs.getInt(3));
					System.out.println("Address : " + rs.getString(4));
					System.out.println("Product ID : " + rs.getInt(5));
					System.out.println("Product Name : " + rs.getString(6));
					System.out.println("Product Quantity : " + rs.getInt(7));
					System.out.println("Product Bill : " + rs.getFloat(8));
					System.out.println("**************************************************\n");

				}

				break;

			case 3:
				con = DatabaseConn.creatC();

				uid = s.getCustomer();

				query = " select * from Resto JOIN Productdata ON Resto.ID_No = Productdata.ID_No where Customer_ID='"+ uid + "' ";
				ps = con.prepareStatement(query);

				rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println("**************************************************");
					System.out.println("Product ID : " + rs.getInt(5));
					System.out.println("Product Name : " + rs.getString(6));
					System.out.println("Product Quantity : " + rs.getInt(7));
					System.out.println("Product Bill : " + rs.getFloat(8));
					System.out.println("**************************************************\n");
				}
				break;

			case 4:
				con = DatabaseConn.creatC();
				uid = s.getCustomer();
				query = " select * from Resto JOIN Productdata ON Resto.ID_No = Productdata.ID_No where Customer_ID='"+ uid + "' ";
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				int count = 0;
				while (rs.next()) {
					System.out.println("**************************************************");
					System.out.println("Product ID : " + rs.getInt(5));
					System.out.println("Product Name : " + rs.getString(6));
					count++;
				}
				System.out.println("Which Product you want to Refund");
				String refund = sc.next();				
				if (count != 0) {
					System.out.println("What you want ");
					System.out.println("1. Change Product");
					System.out.println("2. Refund");
					sel = sc.nextInt();
					switch (sel) {
					case 1:
						System.out.println(" Please order new Product \n");
						pm.getProductMenu(s.getCustomer());
						uid = s.getCustomer();
						 con = DatabaseConn.creatC();
						String pname = refund;
						query = " select * from Resto JOIN Productdata ON Resto.ID_No = Productdata.ID_No where P_name='"
								+ pname + "' and Customer_ID='" + uid + "' "; 
						ps = con.prepareStatement(query);
						rs = ps.executeQuery();
						while (rs.next()) {
							System.out.println("Your new Product is :");
							System.out.println("**************************************************");
							System.out.println("Product ID : " + rs.getInt(5));
							System.out.println("Product Name : " + rs.getString(6));
							System.out.println("Product Quantity : " + rs.getInt(7));
							System.out.println("Product Bill : " + rs.getFloat(8));
							System.out.println("**************************************************\n");
						}
						break;
					case 2:
						System.out.println("Your Product Bill : " + rs.getFloat(8));
						System.out.println("Your bill will be Refunded soon");
						break;
					}
				}
				if (count == 0) {
					System.out.println("No matching Product Found");
				}

				break;
			case 5:

				l.getLogin();
				break;

			default:
				System.out.println("Incorrect Option Selected ......Try Again ......!!");
				continue;
			}
			 break;
		}

	}
}
