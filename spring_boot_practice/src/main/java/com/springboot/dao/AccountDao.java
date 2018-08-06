package com.springboot.dao;

import com.springboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 账户Dao接口
 */
public interface AccountDao extends JpaRepository<Account, Integer> {
}
