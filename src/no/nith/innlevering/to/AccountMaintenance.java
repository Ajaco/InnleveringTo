package no.nith.innlevering.to;

import java.sql.*;
import java.util.*;
import db.ConnectToDB;

public class AccountMaintenance {
	private final static String username = "root";
	private final static String password = "";
	
	//public static void updateAccounts(String tableName, String tableUpdate){}
	//public static Map<String, Account> getAccounts(String tableName){}
	
	private static Connection getConnection(String user, String pass) throws SQLException {
		ConnectToDB db = new ConnectToDB(user, pass);
		return db.getConnection();
	}
		
	public static Account getAccount(String tableName, String accountNumber){
		
		Account account = null;
		Connection con = null;
		
		try {
			con = getConnection(username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement prepStatement;
		try {
            prepStatement = con.prepareStatement("Select * from " + tableName + " where accountNumber = ?");
            prepStatement.setString(1, accountNumber);
            prepStatement.execute();

            ResultSet result = prepStatement.getResultSet();

            if (result.first()) {
                String resAccountNumber = result.getString(1); 
                double resBalance = result.getDouble(2);
                double resInterest = result.getDouble(3);
                account = new Account(resAccountNumber, resBalance, resInterest);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return account;
	}
	
}
