package com.spring_practice.test;

import com.spring_practice.service.BankService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBankService {

    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testInMoney() {
        BankService bankService = (BankService) ac.getBean("bankService");
        System.out.println(bankService.inMoney(200, 2));
    }

    @Test
    public void testOutMoney() {
        BankService bankService = (BankService) ac.getBean("bankService");
        System.out.println(bankService.outMoney(200, 1));
    }

    @Test
    public void transferAccounts() {
        BankService bankService = (BankService) ac.getBean("bankService");
        bankService.transferAccounts(50, 1, 2);
    }

}
