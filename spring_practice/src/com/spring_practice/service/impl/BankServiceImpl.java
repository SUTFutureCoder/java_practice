package com.spring_practice.service.impl;

import com.spring_practice.dao.impl.BankDaoImpl;
import com.spring_practice.service.BankService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional
public class BankServiceImpl implements BankService {

    private BankDaoImpl bankDao;

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setBankDao(BankDaoImpl bankDao) {
        this.bankDao = bankDao;
    }

    @Override
    public int inMoney(int money, int userId) {
        return bankDao.inMoney(money, userId);
    }

    @Override
    public int outMoney(int money, int userId) {
        return bankDao.outMoney(money, userId);
    }

    @Override
    public void transferAccounts(int money, int userIdA, int userIdB) {
        bankDao.outMoney(money, userIdA);
        bankDao.inMoney(money, userIdB);
    }

}
