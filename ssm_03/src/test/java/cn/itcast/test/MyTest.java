package cn.itcast.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.service.AccountService;

public class MyTest {
	
@Test
 public void test01() {
	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationcontext.xml");
	AccountService service = context.getBean(AccountService.class);
	service.findAll();

 }
}
