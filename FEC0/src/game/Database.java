package game;

import java.sql.*;

public class Database {
	private static Connection conn;
	private static Statement stmt;
	public Database() {
		// TODO Auto-generated constructor stub
	}
	
	private static void initializeForWrite() {
		conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(Database.class.getResource("cards.db").toString());
			stmt = conn.createStatement();
			String Query = "EXISTS CARDS";
			boolean r = false;
			r = stmt.execute(Query);
			if(r) {
				Query = "CREATE DATABASE CARDS";
				stmt.execute(Query);
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		initializeForWrite();
	}

}
