package com.springboot.controller;

import com.springboot.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 账户controller层
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/transfer")
    public String transferAccount() {
        try {
            accountService.transferAccounts(1, 2, 200);
            return "OK";
        } catch (Exception e) {
            return "NO";
        }
    }
}
