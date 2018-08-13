package com.spring_practice.service;

public interface BankService {

    public int inMoney(int money, int userId);

    public int outMoney(int money, int userId);

    public void transferAccounts(int money, int userIdA, int userIdB);

}
