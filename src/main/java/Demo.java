import model.Account;
import services.AccountService;

import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Connect to the "accounts" database.
        try {
            // Create the "account" table.
            AccountService.create();
            //Insert data into "account" table.
            AccountService.addAccount(new Account("b1", "id1", "name1", "dob1", "aadhaar1", "accountnumber1"));
            AccountService.addAccount(new Account("b2", "id2", "name2", "dob2", "aadhaar2", "accountnumber2"));
            //Select data from "account" table.
            AccountService.getAccounts();
            //Delete data from "account" table.
            AccountService.removeAccount(new Account("b2", "id2", "name2", "dob2", "aadhaar2", "accountnumber2"));
            //Select data from "account" table.
            AccountService.getAccounts();
            //Update data into "account" table.
            AccountService.updateAccount(new Account("b2", "id2", "name2", "dob2", "aadhaar2", "accountnumber2"), new Account("b2", "id2", "name2222222", "dob2", "aadhaar2", "accountnumber2"));
            System.out.println("\tPrinting accounts after updating id :: b2");
            //Select data from "account" table.
            AccountService.getAccounts();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
