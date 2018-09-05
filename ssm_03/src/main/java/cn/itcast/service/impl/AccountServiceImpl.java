package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
     @Autowired
	 private AccountDao dao;
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		List<Account> list = dao.findAll();
		System.out.println("spring框架搭建");
		return list;
	}

}
