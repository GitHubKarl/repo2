package com.baidu.service;

import com.baidu.domain.Account;

import java.util.List;

public interface AccountService {
    void save(Account account); //保存账户数据
    List<Account> findAll(); //查询账户数据
}
