package com.acer.service;

/**
 * @Description:  用户数据增删改查
 * @Author: zhj
 * @Date: 2022/11/1 15:23
 */
public interface UserService {

	/**
	 * 判断用户名是否存在
	 * @author zhj
	 * @date 15:25 2022/11/1
	 * @param username 用户名
	**/
	public boolean queryUsernameIsExist(String username);
}
