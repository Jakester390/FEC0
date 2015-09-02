package game;

import java.sql.*;

public class Database {
	private static Connection conn;
	private static Statement stmt;
	
	public static void shutDown() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void initializeDatabase() {
		conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:cards.db");
			stmt = conn.createStatement();
			String Query = "CREATE TABLE IF NOT EXISTS CARDS" +
			"(ID TEXT PRIMARY KEY NOT NULL, FULL_NAME TEXT NOT NULL," +
			" NAME TEXT NOT NULL, ATTACK INT NOT NULL, SUPPORT INT NOT NULL," +
			" COST INT NOT NULL, PROMOTION_COST INT NOT NULL, WEAPON INT NOT NULL," +
			" INSIGNIA INT NOT NULL, FLAGS INT NOT NULL, GENDER INT NOT NULL)";
			stmt.executeUpdate(Query);
			Query = "CREATE TABLE IF NOT EXISTS CTEXT" +
			"(ID TEXT PRIMARY KEY NOT NULL, CLASS TEXT, QUOTE TEXT, SKILL_TEXT TEXT)";
			stmt.executeUpdate(Query);
			stmt.close();
			conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void addInput(String ID, String fullName, String name, int attack, int support, 
			int cost, int promotionCost, int weapon, int insignia, int flags, int gender, 
			String feClass, String quote, String skillText) {
		String query = "INSERT INTO CARDS (ID,FULL_NAME,NAME,ATTACK,SUPPORT,COST,PROMOTION_COST," +
			"WEAPON,INSIGNIA,FLAGS,GENDER) VALUES (";
		query += "'" + ID + "', ";
		query += "'" + fullName + "', ";
		query += "'" + name + "', ";
		query += attack + ", " + support + ", ";
		query += cost + ", " + promotionCost + ", ";
		query += weapon + ", " + insignia + ", ";
		query += flags + ", " + gender + " );";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			query = "INSERT INTO CTEXT (ID,CLASS,QUOTE,SKILL_TEXT) " +
					"VALUES ('" + ID + "', " + "'" + feClass + "', " + "'" + quote + "', " + 
					"'" + skillText + "' );";
			stmt.executeUpdate(query);
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public static String getData(String ID) {
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM CARDS WHERE ID = " + ID);
			if(rs.next()) {
				String ret = "";
				for (int i = 2; i < 11; i++) {
					ret += rs.getString(i) + ";";
				}
				ret += rs.getString(12);
				return ret;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
	}
	public static String[] getText(String ID) {
		String[] data = new String[3];
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM CARDS WHERE ID = " + ID);
			if(rs.next()) {
				data[0] = rs.getString("CLASS");
				data[1] = rs.getString("QUOTE");
				data[2] = rs.getString("SKILL_TEXT");
				return data;
			}
			return null;
		} catch (SQLException e) {
				return null;
		}
	}
	public static void main(String[] args) {
		initializeDatabase();
	}

}
