package resto_Hotel;

import java.io.*;
import java.util.ListIterator;

class ProductMenu extends Set {
//Set s = new Set();
	
	public void getProductMenu(String s) throws Exception {

		File f = new File(s+".txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = null;
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ListIterator<Resto> li = null;
		try {
			int totalbill = 0;
			int southind = 0, northind = 0, rajasthani = 0, gujrati = 0, bangali = 0, desert = 0, colddrink = 0,
					icecream = 0;

			while (true) {
				System.out.println("   			***** ..  Menu  ..*****\n");
				System.out.println("1.  South Indian Dishes			7. Cold Drinks");
				System.out.println("2.  North Indian Dishes			8. Ice Creams");
				System.out.println("3.  Rajasthani Dishes			9. Tea");
				System.out.println("4.  Gujarati  Dishes				10. Juce");
				System.out.println("5.  Bangali Dishes				11. Break Fasts");
				System.out.println("6.  Dessert Dishes				12. Latur's Speacial Vadapav");
				System.out.println("				0.  Exit\n");
				System.out.println("Enter Your Choice");

				int ch = Integer.parseInt(br.readLine());
				if (ch == 9 || ch == 10 || ch == 11 || ch == 12) {
					System.out.println("This Products are not currently available \n");
				}
				/////////////////////////////////////////////////////////////////////////////////////////////////////////
				switch (ch) {
				case 1:
					while (true) {
						System.out.println("\n  Welcome To South Indian Food Court \n");
						System.out.println(" 		.. Menu ..			");
						System.out.println("1.  Chole Bhature    	= 40 rs");
						System.out.println("2.  Idali Samber     	 	= 30 rs");
						System.out.println("3.  Puttu           		= 20 rs");
						System.out.println("4.  Masala Dosa	     	= 60 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");
						int ch1 = Integer.parseInt(br.readLine());
						if (ch1 == 6 || ch1 == 7 || ch1 == 8 || ch1 == 9 || ch1 == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch1 == 1) {
							int rate = 40;
							itembill(rate, "Chole Bhature");
							amount[0] = amounts;
							delivery[0] = cash;

						} else if (ch1 == 2) {
							int rate = 30;
							itembill(rate, "Idali Samber");
							amount[1] = amounts;
							delivery[1] = cash;

						} else if (ch1 == 3) {
							int rate = 20;
							itembill(rate, "Puttu");
							amount[2] = amounts;
							delivery[2] = cash;

						} else if (ch1 == 4) {
							int rate = 60;
							itembill(rate, "Masala Dosa");
							amount[3] = amounts;
							delivery[3] = cash;

						} else if (ch1 == 5) {
							System.out.println("...Thank You For Visiting South Indian Food Court...\n");
							break;
						}
					}

					southind = amount[0] + delivery[0] + amount[1] + delivery[1] + amount[2] + delivery[2] + amount[3]
							+ delivery[2];
					// break;
					continue;
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 2:
					while (true) {
						System.out.println("\n  Welcome To North Indian Food Court \n");
						System.out.println(" 		.. Menu ..");
						System.out.println("1.  Aloo Chole         = 40 rs");
						System.out.println("2.  Dum Biryani       = 80 rs");
						System.out.println("3.  Butter Chicken    = 60 rs");
						System.out.println("4.  Aloo Samosa      = 30 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");

						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {

							int rate = 40;
							itembill(rate, "Aloo Chole");
							amount[4] = amounts;
							delivery[4] = pay;
						}
						if (ch == 2) {
							int rate = 80;
							itembill(rate, "Dum Biryani");
							amount[5] = amounts;
							delivery[5] = pay;
						}
						if (ch == 3) {
							int rate = 60;
							itembill(rate, "Butter Chicken");
							amount[6] = amounts;
							delivery[6] = pay;
						}
						if (ch == 4) {
							int rate = 30;
							itembill(rate, "Aloo Samosa");
							amount[7] = amounts;
							delivery[7] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting North Indian Food Court...\n");
							break;
						}
					}
					northind = amount[4] + amount[5] + amount[6] + amount[7] + delivery[4] + delivery[5] + delivery[6]
							+ delivery[7];
					// break;
					continue;
				////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 3:
					while (true) {
						System.out.println(" \n Welcome To Rajasthani Food Court \n");
						System.out.println(" 		.. Menu ..");
						System.out.println("1.  Dal Bati Churma   	  = 190 rs");
						System.out.println("2.  Mohan Thal        	  =90 rs");
						System.out.println("3.  Lal Maas           		  = 50 rs");
						System.out.println("4.  Mava Kachori      	  = 40 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");
						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {
							int rate = 190;
							itembill(rate, "Dal Bati Churma");
							amount[8] = amounts;
							delivery[8] = pay;
						}
						if (ch == 2) {
							int rate = 90;
							itembill(rate, "Mohan Thal");
							amount[9] = amounts;
							delivery[9] = pay;
						}
						if (ch == 3) {
							int rate = 50;
							itembill(rate, "Lal Mass");
							amount[10] = amounts;
							delivery[10] = pay;
						}
						if (ch == 4) {
							int rate = 40;
							itembill(rate, "Mava Kachori");
							amount[11] = amounts;
							delivery[11] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting Rajasthani Food Court...\n");
							break;
						}
					}
					rajasthani = amount[8] + amount[9] + amount[10] + amount[11] + delivery[8] + delivery[9]
							+ delivery[10] + delivery[11];
					// break;
					continue;
				///////////////////////////////////////////////////////////////////////////////////////////////////
				case 4:
					while (true) {
						System.out.println("\n  Welcome To Gujrati Food Court \n");
						System.out.println(" 		.. Menu ..");
						System.out.println("1.  Dhokla           	= 40 rs");
						System.out.println("2.  Handava          	= 60 rs");
						System.out.println("3.  Thepla           	= 50 rs");
						System.out.println("4.  Fafda Jalebi     	= 30 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");
						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {
							int rate = 40;
							itembill(rate, "Dhokla");
							amount[12] = amounts;
							delivery[12] = pay;
						}
						if (ch == 2) {
							int rate = 60;
							itembill(rate, "Handava");
							amount[13] = amounts;
							delivery[13] = pay;
						}
						if (ch == 3) {
							int rate = 50;
							itembill(rate, "Thepla");
							amount[14] = amounts;
							delivery[14] = pay;
						}
						if (ch == 4) {
							int rate = 30;
							itembill(rate, "Fafda Jalebi");
							amount[15] = amounts;
							delivery[15] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting Gujrati Food Court...\n");
							break;
						}
					}
					gujrati = amount[12] + amount[13] + amount[14] + amount[15] + delivery[12] + delivery[13]
							+ delivery[14] + delivery[15];
					// break;
					continue;
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 5:
					while (true) {
						System.out.println(" \n Welcome To Bangali Food Court \n");
						System.out.println(" 		.. Menu ..");
						System.out.println("1.  Bhapaa Aloo              	 = 40 rs");
						System.out.println("2.  Chingari Malai Curry    	 = 30 rs");
						System.out.println("3.  Bangali Lamb Curry      	 = 30 rs");
						System.out.println("4.  Doi Maach               		 = 60 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");
						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {
							int rate = 40;
							itembill(rate, "Bhapaa Aloo");
							amount[16] = amounts;
							delivery[16] = pay;
						}
						if (ch == 2) {
							int rate = 30;
							itembill(rate, "Chingari Malai Curry");
							amount[17] = amounts;
							delivery[17] = pay;
						}
						if (ch == 3) {
							int rate = 30;
							itembill(rate, "Bangali Lamb Curry");
							amount[18] = amounts;
							delivery[18] = pay;
						}
						if (ch == 4) {
							int rate = 60;
							itembill(rate, "Doi Maach");
							amount[19] = amounts;
							delivery[19] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting Bangali Food Court...\n");
							break;
						}
					}
					bangali = amount[16] + amount[17] + amount[18] + amount[19] + delivery[16] + delivery[17]
							+ delivery[18] + delivery[19];
					// break;
					continue;
				/////////////////////////////////////////////////////////////////////////////////////////////////////
				case 6:
					while (true) {
						System.out.println("\n  Welcome To Dessert Food Court \n");
						System.out.println(" 		.. Menu ..");
						System.out.println("1.  Mangomisu						= 40 rs");
						System.out.println("2.  Apple Pai							= 70 rs");
						System.out.println("3.  Almond Malai Kulfi        				= 30 rs");
						System.out.println("4.  Lemon Tart							= 60 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");
						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {
							int rate = 40;
							itembill(rate, "MAngomisu");
							amount[20] = amounts;
							delivery[20] = pay;
						}
						if (ch == 2) {
							int rate = 70;
							itembill(rate, "Apple Pai");
							amount[21] = amounts;
							delivery[21] = pay;
						}
						if (ch == 3) {
							int rate = 30;
							itembill(rate, "Almond Malai Kulfi");
							amount[22] = amounts;
							delivery[23] = pay;
						}
						if (ch == 4) {
							int rate = 60;
							itembill(rate, "Lemon Tart");
							amount[23] = amounts;
							delivery[24] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting Dessert Food Court...\n");
							break;
						}
					}
					desert = amount[20] + amount[21] + amount[22] + amount[23] + delivery[20] + delivery[21]
							+ delivery[22] + delivery[23];
					// break;
					continue;
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 7:
					while (true) {
						System.out.println("\n  Welcome To Cold Drinks Court \n");
						System.out.println(" 		.. Menu ..");
						System.out.println("1.  Coca Cola						= 60 rs");
						System.out.println("2.  Sprite							= 20 rs");
						System.out.println("3.  Soda							= 30 rs");
						System.out.println("4.  RedBull						= 80 rs");
						System.out.println("5.  Exit\n");
						System.out.println("Enter Your Choice");
						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {
							int rate = 60;
							itembill(rate, "Coca cola");
							amount[24] = amounts;
							delivery[24] = pay;
						}
						if (ch == 2) {
							int rate = 20;
							itembill(rate, "Sprite");
							amount[25] = amounts;
							delivery[25] = pay;
						}
						if (ch == 3) {
							int rate = 30;
							itembill(rate, "Soda");
							amount[26] = amounts;
							delivery[26] = pay;
						}
						if (ch == 4) {
							int rate = 80;
							itembill(rate, "Red Bull");
							amount[27] = amounts;
							delivery[27] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting Cold Drinks Court...\n");
							break;
						}
					}
					colddrink = amount[24] + amount[25] + amount[26] + amount[27] + delivery[24] + delivery[25]
							+ delivery[26] + delivery[27];
					// break;
					continue;
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 8:
					while (true) {
						System.out.println("\n   Welcome to Ice-Creams Court  \n");
						System.out.println("      ........ Menu .......");
						System.out.println("1. Kulfi					10 Rs");
						System.out.println("2. SweetCream			10 Rs");
						System.out.println("3. Chokobar 				15 Rs");
						System.out.println("4. Milk Cream				20 Rs");
						System.out.println("5. Exit");
						System.out.println("  Enter Your Choice ");
						ch = Integer.parseInt(br.readLine());
						if (ch == 6 || ch == 7 || ch == 8 || ch == 9 || ch == 0) {
							System.out.println("Please enter Correct Option ....");
						}
						if (ch == 1) {
							int rate = 10;
							itembill(rate, "Kulfi");
							amount[28] = amounts;
							delivery[28] = pay;
						}
						if (ch == 2) {
							int rate = 10;
							itembill(rate, "Sweet Cream");
							amount[29] = amounts;
							delivery[29] = pay;
						}
						if (ch == 3) {
							int rate = 15;
							itembill(rate, "Chokobar");
							amount[30] = amounts;
							delivery[30] = pay;
						}
						if (ch == 4) {
							int rate = 20;
							itembill(rate, "Milk Cream");
							amount[31] = amounts;
							delivery[31] = pay;
						}
						if (ch == 5) {
							System.out.println("...Thank You For Visiting Ice-Creams Food Court...\n");
							break;
						}
					}
					desert = amount[28] + amount[29] + amount[30] + amount[31] + delivery[28] + delivery[29]
							+ delivery[30] + delivery[31];

					// break;
					continue;
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 9:
					continue;
				case 10:
					continue;
				case 11:
					continue;
				case 12:
					continue;
				case 0:

					System.out.println("Are You Sure... for Exit");
					System.out.println("1. Yes");
					System.out.println("2. No");
					ch = Integer.parseInt(br.readLine());
					
					
					if (ch == 2) {
						System.out.println("	... Welcome for Visiting Again ...\n");
						continue;
					}
					if (amount[0] >= 40 || delivery[0] >= 40) {
						getDetails(0, 40, "Chole Bhature");
						
					}
					if (amount[1] >= 30 || delivery[1] >= 30) {
						int p1 = amount[1] / 30;
						int p2 = delivery[1] / 30;
						int item = p1 + p2;
						String product = "Idali Samber";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[2] >= 20 || delivery[2] > 20) {
						int p1 = amount[2] / 20;
						int p2 = delivery[2] / 20;
						int item = p1 + p2;
						String product = "Puttu";
						al.add(new Resto(item, product));
						float bill = item * 20;
						dataset(item, product, bill);
					}
					if (amount[3] >= 60 || delivery[3] >= 60) {
						int p1 = amount[3] / 60;
						int p2 = delivery[3] / 60;
						int item = p1 + p2;
						String product = "Masala Dosa";
						al.add(new Resto(item, product));
						float bill = item * 60;
						dataset(item, product, bill);
					}
					if (amount[4] >= 40 || delivery[4] >= 40) {
						int item = amount[4] / 40;
						String product = "Aloo Chole";
						float bill = item * 40;
						al.add(new Resto(item, product));
						dataset(item, product, bill);
					}
					if (amount[5] >= 80 || delivery[5] >= 80) {
						int item = amount[5] / 80;
						String product = "Dum Biryani";
						al.add(new Resto(item, product));
						float bill = item * 80;
						dataset(item, product, bill);
					}
					if (amount[6] >= 60 || delivery[6] >= 60) {
						int item = amount[6] / 60;
						String product = "Butter Chicken";
						al.add(new Resto(item, product));
						float bill = item * 60;
						dataset(item, product, bill);
					}
					if (amount[7] >= 30 || delivery[7] >= 30) {
						int item = amount[7] / 30;
						String product = "Aloo Samosa";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[8] >= 180 || delivery[8] >= 180) {
						int item = amount[8] / 180;
						String product = "Dal Bati Churn";
						al.add(new Resto(item, product));
						float bill = item * 180;
						dataset(item, product, bill);
					}
					if (amount[9] >= 90 || delivery[9] >= 90) {
						int item = amount[9] / 90;
						String product = "Mohan Thal";
						al.add(new Resto(item, product));
						float bill = item * 90;
						dataset(item, product, bill);
					}
					if (amount[10] >= 50 || delivery[10] >= 10) {
						int item = amount[10] / 50;
						String product = "Lal Mass";
						al.add(new Resto(item, product));
						float bill = item * 50;
						dataset(item, product, bill);
					}
					if (amount[11] >= 40 || delivery[11] >= 40) {
						int item = amount[11] / 40;
						String product = "Mava Kachori";
						al.add(new Resto(item, product));
						float bill = item * 40;
						dataset(item, product, bill);
					}
					if (amount[12] >= 40 || delivery[12] >= 40) {
						int item = amount[12] / 40;
						String product = "Dhokla";
						al.add(new Resto(item, product));
						float bill = item * 40;
						dataset(item, product, bill);
					}
					if (amount[13] >= 60 || delivery[13] >= 60) {
						int item = amount[13] / 60;
						String product = "Handava";
						al.add(new Resto(item, product));
						float bill = item * 60;
						dataset(item, product, bill);
					}
					if (amount[14] >= 50 || delivery[14] >= 50) {
						int item = amount[14] / 50;
						String product = "Thepla";
						al.add(new Resto(item, product));
						float bill = item * 50;
						dataset(item, product, bill);
					}
					if (amount[15] >= 30 || delivery[15] >= 30) {
						int item = amount[15] / 30;
						String product = "Fafda Jalebi";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[16] >= 40 || delivery[16] >= 40) {
						int item = amount[16] / 40;
						String product = "Bhapaa Aloo";
						al.add(new Resto(item, product));
						float bill = item * 40;
						dataset(item, product, bill);
					}
					if (amount[17] >= 30 || delivery[17] >= 30) {
						int item = amount[17] / 30;
						String product = "Malai Curry";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[18] >= 30 || delivery[18] >= 30) {
						int item = amount[18] / 30;
						String product = "Lamb Curry";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[19] >= 60 || delivery[19] >= 60) {
						int item = amount[19] / 60;
						String product = "Doi Maach";
						al.add(new Resto(item, product));
						float bill = item * 60;
						dataset(item, product, bill);
					}
					if (amount[20] >= 40 || delivery[20] >= 40) {
						int item = amount[20] / 40;
						String product = "Mangomisu";
						al.add(new Resto(item, product));
						float bill = item * 40;
						dataset(item, product, bill);
					}
					if (amount[21] >= 70 || delivery[21] >= 70) {
						int item = amount[21] / 70;
						String product = "Apple Pai";
						al.add(new Resto(item, product));
						float bill = item * 70;
						dataset(item, product, bill);
					}
					if (amount[22] >= 30 || delivery[22] >= 30) {
						int item = amount[22] / 30;
						String product = "Malai Kulfi";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[23] >= 60 || delivery[23] >= 60) {
						int item = amount[23] / 60;
						String product = "Lemon Tart";
						al.add(new Resto(item, product));
						float bill = item * 60;
						dataset(item, product, bill);
					}
					if (amount[24] >= 60 || delivery[24] >= 60) {
						int item = amount[24] / 60;
						String product = "Coka Cola";
						al.add(new Resto(item, product));
						float bill = item * 60;
						dataset(item, product, bill);
					}
					if (amount[25] >= 20 || delivery[25] >= 20) {
						int item = amount[25] / 20;
						String product = "Sprite";
						al.add(new Resto(item, product));
						float bill = item * 20;
						dataset(item, product, bill);
					}
					if (amount[26] >= 30 || delivery[26] >= 30) {
						int item = amount[26] / 30;
						String product = "Soda";
						al.add(new Resto(item, product));
						float bill = item * 30;
						dataset(item, product, bill);
					}
					if (amount[27] >= 80 || delivery[27] >= 80) {
						int item = amount[27] / 80;
						String product = "Red Bull";
						al.add(new Resto(item, product));
						float bill = item * 80;
						dataset(item, product, bill);
					}
					if (amount[28] >= 10 || delivery[28] >= 10) {
						int item = amount[28] / 10;
						String product = "Kulfi";
						al.add(new Resto(item, product));
						float bill = item * 10;
						dataset(item, product, bill);
					}
					if (amount[29] >= 10 || delivery[29] >= 10) {
						int item = amount[29] / 10;
						String product = "Sweet Cream";
						al.add(new Resto(item, product));
						float bill = item * 10;
						dataset(item, product, bill);
					}
					if (amount[30] >= 15 || delivery[30] >= 15) {
						int item = amount[30] / 15;
						String product = "Chokobar";
						al.add(new Resto(item, product));
						float bill = item * 15;
						dataset(item, product, bill);
					}
					if (amount[31] >= 20 || delivery[31] >= 20) {
						int item = amount[31] / 20;
						String product = "Milk Cream";
						float bill = item * 20;
						al.add(new Resto(item, product));
						dataset(item, product, bill);
					}

					totalbill = icecream + southind + northind + rajasthani + gujrati + bangali + desert + colddrink;

					if (ch == 1) {
						if (f.isFile()) {
							pw = new PrintWriter(fw, true);
							pw.println("*********************************************************************");
							pw.println("Customer Id : "+s);
							pw.println("Orders are : ");
							pw.println(al);
							pw.println("          ........ Total Bill is " + totalbill + " Rs .......");
							pw.println("*********************************************************************\n");

							System.out.println("*******************************************************");
							System.out.println(" \n   .................... RECEIPT .....................");
							System.out.println("Customer Id : "+s);
							System.out.println(" Your Orders are : ");
							br1 = new BufferedReader(fr);
							br1.readLine();
							System.out.println("*******************************************************");

							li = al.listIterator();

							while (li.hasNext())
								System.out.println(li.next());
							System.out.println("*******************************************************");
							System.out.println("          ........ Total Bill is " + totalbill + " Rs ........");
							System.out.println("      ............. Take Your Bill Sir/Mam ..........  \n");
							System.out.println("...Thank You For Visiting Tech-Resto Restorent App ...");
							System.out.println("              			..... Visit Again .....\n");
							System.out.println("*******************************************************");
							pw.flush();
							pw.close();
						}
					}
					break;

				default:
					System.out.println("Please Enter Correct Option From Display ....\n");
					continue;
				}
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("Enter Numbers Only....!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
