package com.project.api.v1.model.entity;

public class BankDetailsEntity {

    //PK - userID + accountNumber
    private String userId;        // FK → USER.user_id
    private Long accountNumber;
    private String ifscCode;
    private String provider;
    private Boolean isPrimaryAccount;

    // --- getters & setters ---

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Boolean getIsPrimaryAccount() {
        return isPrimaryAccount;
    }

    public void setIsPrimaryAccount(Boolean isPrimaryAccount) {
        this.isPrimaryAccount = isPrimaryAccount;
    }
}
