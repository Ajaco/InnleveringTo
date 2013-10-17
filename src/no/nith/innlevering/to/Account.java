package no.nith.innlevering.to;

import java.util.*;
import java.sql.*;

public class Account {
	private String accountNumber;
	private double balance, interest;
	
	public Account(String accountNumber, double balance, double interest) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interest = interest;
	}
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setInterest(double interest){
		this.interest = interest;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getInterest(){
		return interest;
	}
	
	/*private static Connection getConnection(String user, String pass) throws SQLException { // litt usikker på om denn eblir riktig, hentet ut i fra vår DBHandler konstruktør i innlevering 1
		ConnectToDB db = new ConnectToDB(user, pass);
		return db.getConnection(); // er user og pass her som jeg er litt usikker på
	}
	
	// Method for creating a new Account based on the values inserted
	public static Account newAccount(int accountNumber, double balance, double interest, String tableName) {
		/*
		if (acountNumber.getAccountNumber == 8) { //test if, sjekke at account number kun er 8 tall ikke mer ikke mindre. Lage hjelpemetode? denne sjekken går igjenn i de andre metodene
			System.out.println("AccountNumber was Invalid, please enter a correct accountNumber that consist of 8 numbers");
		}
		
		
		//Establish connection to local database
		Connection con = null;                               // veldig usikker på om dette er rette måten å gjøre det på?
		try {
			con = getConnection(username, password);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		PreparedStatement newStatement;
		try {
			newStatement = con.prepareStatement("insert into" + tableName + "values(, , ,)");
			newStatement.setInt(1, accountNumber);
			newStatement.setDouble(2, balance);
			newStatement.setDouble(3, interest);
			newStatement.executeUpdate();
		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		
		return new Account(accountNumber, balance, interest);
	}
	
	public static ArrayList<Account> getAllAccounts(String tableName) {
		
		Connection con = null;                               // veldig usikker på om dette er rette måten å gjøre det på?
		try {
			con = getConnection(username, password);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		PreparedStatement newStatement;
		ArrayList<Account> myAccountList = new ArrayList<Account>();
		try {
            newStatement = con.prepareStatement("SELECT * FROM " + tableName); // her må vi kanskje skrive litt om begynner å bli trøtt så kan prøve i morgen tidlig
            newStatement.execute();

            ResultSet results = newStatement.getResultSet();

            if (results.first()) {  // det er denne delen jeg lurer på om vi kan skrive om i og med at dette er copy pasta fra den på nette
                do{
                    int fetchedAccountNumber = results.getInt(1);
                    double fetchedBalance = results.getDouble(2);
                    double fetchedInterest = results.getDouble(3);
                    myAccountList.add(new Account(fetchedAccountNumber, fetchedBalance, fetchedInterest));
                } while (results.next());
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

        return myAccountList;
		
	}
	
	public Account getAccount(int accountNumber, String tableName) {
		Account account = null;
		
		Connection con = null;                               // veldig usikker på om dette er rette måten å gjøre det på?
		try {
			con = getConnection(username, password);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		PreparedStatement newStatement;
		try {
            newStatement = con.prepareStatement("Select * from " + tableName + " where accountNumber = ?");

            newStatement.setInt(1, accountNumber);
            newStatement.execute();

            ResultSet result = newStatement.getResultSet();

            if (result.first()) {
                int incertedAccountNumber = result.getInt(1); // kanskje inserted her ikke var det beste å kalle dem, dette er også nesten bare copy-paste
                double incertedBalance = result.getDouble(2);
                double incertedInterest = result.getDouble(3);
                account = new Account(incertedAccountNumber, incertedBalance, incertedInterest);
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
	*/
	//uppdate metode
	
}
