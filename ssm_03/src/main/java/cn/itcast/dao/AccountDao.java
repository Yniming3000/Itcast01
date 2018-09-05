package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.itcast.domain.Account;

public interface AccountDao {
    
	@Select("select * from account")
	public List<Account> findAll();
	//ÕâÀïÌí¼Ó×¢ÊÍ
}
