package io.ace.springframework.aop.model;

public class Account {
    private String accountNo;
    private String accountHolerName;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolerName() {
        return accountHolerName;
    }

    public void setAccountHolerName(String accountHolerName) {
        this.accountHolerName = accountHolerName;
    }
}
