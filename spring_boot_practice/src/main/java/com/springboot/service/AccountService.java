package com.springboot.service;

/**
 * 账户service接口
 */
public interface AccountService {

    /**
     * 从A用户转账到B用户钱
     *
     *
     * @param fromUser
     * @param toUser
     * @param account
     */
    public void transferAccounts(int fromUser, int toUser, float account);

}
