package services;

import java.sql.*;

public class DBConnection {
	private final String dbUrl = "jdbc:postgresql://localhost/orm";
	private final String dbUser = "postgres";
	private final String dbPassword = "postgres";

	private Connection connection;

	public DBConnection() {
		initializeConnection();
	}
	
	public void initializeConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			this.connection = DriverManager.getConnection(this.dbUrl, this.dbUser, this.dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ResultSet execute(String query) {
		try {
			Statement statement = this.connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ResultSet get(String table, String field, String key) {
		try {
			String query = "SELECT * FROM " + table + " WHERE " + field + " = " + key;
			System.out.println("Query executed");
			Statement statement = this.connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void insert(String tableName, String fields, String values) {
		try {
			Statement statement = this.connection.createStatement();
			         statement.executeUpdate("INSERT INTO " + tableName + " (" + fields + ") VALUES (" + values + ");");
			         statement.close();
			         this.connection.close();
		}


		catch (SQLException e) {
			e.printStackTrace();
	      	}
	 	    }
                              }
