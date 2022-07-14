package services;

import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.ServletContextEvent;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class DeployListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		createDBTables();
	}

	private void createDBTables() {
		List<String> sqlQueries = new ArrayList<>();
		sqlQueries.add("CREATE TABLE _user_ (" + "ID int GENERATED ALWAYS AS IDENTITY, " + "First_Name varchar(255), "
				+ "Last_Name varchar(255), " + "Age int, " + "Male boolean, " + "Role varchar(255), "
				+ "E_Mail varchar(255) UNIQUE, " + "Phone_Number varchar(255) UNIQUE, " + "Password varchar(255), "
				+ "PRIMARY KEY (ID) );");

		sqlQueries.add("CREATE TABLE meal (" + "ID int GENERATED ALWAYS AS IDENTITY, " + "Name varchar(255), "
				+ "Price double precision, " + "Type varchar(255), " + "Preparation_Time varchar(255), "
				+ "Available boolean, " + "Description varchar(255), " + "PRIMARY KEY (ID) );");

		sqlQueries.add("CREATE TABLE _table_ (" + "ID int GENERATED ALWAYS AS IDENTITY, " + "Number int, "
				+ "Facilities varchar(255), " + "Type varchar(255), " + "Special_Price double precision, "
				+ "Available boolean, " + "PRIMARY KEY (ID) );");

		sqlQueries.add("CREATE TABLE _order_ (" + "ID int GENERATED ALWAYS AS IDENTITY, " + "Table_Id int, "
				+ "Time varchar(255), " + "Price double precision, " + "Paid boolean DEFAULT false, "
				+ "Description varchar(255), " + "PRIMARY KEY (ID), " + "CONSTRAINT fk_table "
				+ "   FOREIGN KEY(Table_Id) " + "   REFERENCES _table_(id) " + "   ON DELETE SET NULL);");

		sqlQueries.add("CREATE TABLE order_meal (" + "Order_Id int NOT NULL, " + "Meal_Id int NOT NULL, "
				+ "CONSTRAINT fk_order " + "   FOREIGN KEY(Order_Id) " + "   REFERENCES _order_(id) "
				+ "   ON DELETE SET NULL, " + "CONSTRAINT fk_meal " + "   FOREIGN KEY(Meal_Id) "
				+ "   REFERENCES meal(id) " + "   ON DELETE SET NULL );");

		sqlQueries.add("CREATE TABLE message (" + "ID int GENERATED ALWAYS AS IDENTITY, " + "Text varchar(255), "
				+ "Customer_Id int, " + "Manager_Id int, " + "PRIMARY KEY (ID), " + "CONSTRAINT fk_customer "
				+ "   FOREIGN KEY(Customer_Id) " + "   REFERENCES _user_(ID) " + "   ON DELETE SET NULL,"
				+ "CONSTRAINT fk_manager " + "   FOREIGN KEY(Manager_Id) " + "   REFERENCES _user_(id)"
				+ "   ON DELETE SET NULL );");

		DBConnection dbConnection = new DBConnection();

		for (String sqlQuery : sqlQueries) {
			dbConnection.execute(sqlQuery);
		}

		dbConnection.insert("_user_", "first_name, last_name, age, male, role, e_mail, phone_number, password",
				"'John', 'Watson', 25, true, 'MANAGER', 'john.w@gmail.com', '+998995219568', '123'");
	}

	public void contextDestroyed(ServletContextEvent event) {

	}
}
