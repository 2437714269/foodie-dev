package com.acer.service.impl;

import com.acer.mapper.UsersMapper;
import com.acer.pojo.Users;
import com.acer.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
/**
 * @Description: 用户数据增删改查
 * @Author: zhj
 * @Date: 2022/11/1 15:28
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

	private final UsersMapper usersMapper;


	/**
	 * 判断用户名是否存在
	 * @author zhj
	 * @date 15:25 2022/11/1
	 * @param username 用户名
	 **/
//	@Transactional(propagation = Propagation.SUPPORTS)
	@Override
	public boolean queryUsernameIsExist(String username) {
		Users result = usersMapper.save(username);
		log.info("用户信息：{}",result.getUsername());
		System.out.println(result == null ? false : true);
		return result == null ? false : true;
	}
}
