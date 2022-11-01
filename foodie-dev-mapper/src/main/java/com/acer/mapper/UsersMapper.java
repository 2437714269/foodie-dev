package com.acer.mapper;

import com.acer.pojo.Users;
import org.apache.ibatis.annotations.Select;


public interface UsersMapper{


	@Select("select * from users where username = #{username}")
	public Users save(String username);

}