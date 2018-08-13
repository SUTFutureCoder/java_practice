package com.spring_practice.dao.impl;

import com.spring_practice.dao.BankDao;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class BankDaoImpl implements BankDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public int inMoney(int money, int userId) {
        String sql = "update t_account2 set balance=balance+:money where id=:userId";
        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("money", money).addValue("userId", userId);
        return namedParameterJdbcTemplate.update(sql, sps);
    }

    @Override
    public int outMoney(int money, int userId) {
        String sql = "update t_account set balance=balance-:money where id=:userId";
        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("money", money).addValue("userId", userId);
        return namedParameterJdbcTemplate.update(sql, sps);
    }


}
