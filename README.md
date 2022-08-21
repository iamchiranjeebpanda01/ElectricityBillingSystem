# ElectricityBillingSystem
Electricity billing system is a JAVA based application. The project aims at serving the electricity department, computerizing the billing system. This project calculates bill against the unit consumed in a specified time frame, tracks the bill payment status and also provides a platform for customers to pay the bill at the comfort of their home.
The project uses the OOPS concepts of JAVA, integrating database with JAVA, basic knowldedge on SQL commands, JAVA AWS and JAVA Swing.

How does the project work?
- For a fresh project with empty database, we run the login.java file.
- Click on sign-up button and create an admin account.
- The admin logs into his account after creating it and adds new customers.
- The admin can view all the details of customers, deposit details and calculate bills, just by providing the units consumed during the month.
- After the admin has added a new customer, the customer can create an username and password in the signup page.
- The customer can log in after creating an username and password.
- The customer can update his information, view information, pay bills, get bill details, generate detailed bill reports according to the month chosen.

About the Database:
The database has 5 tables: bill, customer, login, meter_info and tax.

Main Challenge during the project creation:
- Maintaining and closing connections to database to avoid SQL_BUSY exception.
- Working on real time project that used abstraction and implementing interfaces and abstract classes.
