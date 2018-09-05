package cn.itcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

//eclipse从github中下载项目

//再上传一下

@Controller
@RequestMapping("/pages")
public class AccountController {
	 @Autowired
	private AccountService service;
	@RequestMapping("/findYou.do")
public String findAll() {
	 List<Account> list = service.findAll();
	 for (Account account : list) {
		System.out.println(account);
	}
	 System.out.println("springmvc框架搭建");
	return "success";
}
}
