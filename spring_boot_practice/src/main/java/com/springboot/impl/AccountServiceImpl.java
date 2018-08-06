package com.springboot.impl;

import com.springboot.dao.AccountDao;
import com.springboot.entity.Account;
import com.springboot.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * 实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    @Transactional
    public void transferAccounts(int fromUser, int toUser, float account) {
        Account fromAccount = accountDao.getOne(fromUser);
        fromAccount.setBalance(fromAccount.getBalance() - account);
        accountDao.save(fromAccount);

        int zero = 1/0;
        Account toAccount = accountDao.getOne(toUser);
        toAccount.setBalance(toAccount.getBalance() + account);
        accountDao.save(toAccount);
    }
}
