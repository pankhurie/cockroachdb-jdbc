package services;

import model.Account;
import util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountService {

    static Connection con = DBConnection.getInstance().getConnection();

    public static void addAccount(Account account) throws SQLException {
        con.createStatement().execute("INSERT INTO accountsdb.accounts (bank_id, user_id, user_name, dob, aadhaar_number, account_number) VALUES (" +
                "'"+account.getBankId() + "', " +
                "'"+account.getUserId() + "', " +
                "'"+account.getUserName() + "', " +
                "'"+account.getDateOfBirth() + "', " +
                "'"+account.getAadharNumber() + "', " +
                "'"+account.getAccountNumber() + "')");
    }

    public static void getAccounts() throws SQLException {
        ResultSet res = con.createStatement().executeQuery("SELECT bank_id, user_id, user_name, dob, aadhaar_number, account_number FROM accounts");
        while (res.next()) {
            System.out.printf("\tAccount Details: %s: %s\n", res.getString("bank_id"), res.getString("user_name"), res.getString("user_id"), res.getString("dob"), res.getString("aadhaar_number"), res.getString("account_number"));
        }
    }

    public static void create() throws SQLException {
        // Create the "accounts" table.
        con.createStatement().execute("CREATE TABLE IF NOT EXISTS accounts (bank_id varchar(30), user_name varchar(30), user_id varchar(30), dob varchar(30), aadhaar_number varchar(30), account_number varchar(30))");

    }

    public static void removeAccount(Account account) throws SQLException {
        // Remove an account from accounts table
        con.createStatement().execute("delete from accounts where bank_id='"+account.getBankId()+"' and user_id='"+account.getUserId()+"' and account_number='"+account.getAccountNumber()+"'");

    }

    public static void updateAccount(Account accountOld, Account accountNew) throws SQLException {
        // update an account
        con.createStatement().execute("update accounts set user_name='"+accountNew.getUserName()+"'"
                +" where bank_id='"+accountOld.getBankId()+"' and user_id='"+accountOld.getUserId()+"' and account_number='"+accountOld.getAccountNumber()+"'");

    }
}