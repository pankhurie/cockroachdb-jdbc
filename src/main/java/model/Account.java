package model;

public class Account {
    private String bankId;
    private String userId;
    private String userName;
    private String dateOfBirth;
    private String aadharNumber;
    private String accountNumber;

    public Account(String bankId, String userId, String userName, String dateOfBirth, String aadharNumber, String accountNumber) {
        this.bankId = bankId;
        this.userId = userId;
        this.userName = userName;
        this.dateOfBirth = dateOfBirth;
        this.aadharNumber = aadharNumber;
        this.accountNumber = accountNumber;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
