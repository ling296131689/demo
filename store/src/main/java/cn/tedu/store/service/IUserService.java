package cn.tedu.store.service;

import cn.tedu.store.entity.User;

/**
 * 处理用户相关业务的业务接口
 */
public interface IUserService {
	
	/**
	 * 用户注册
	 * @param user 新用户的信息
	 */
	void reg(User user);

	/**
	 * 登录
	 * @param username 用户名
	 * @param password 密码
	 * @return 登录成功的用户的基本信息
	 */
	User login(String username, String password);
	
	/**
	 * 修改头像
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户名
	 * @param avatar 新头像
	 */
	void changeAvatar(Integer uid, String username, String avatar);
	
	/**
	 * 修改密码
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户名
	 * @param oldPassword 原密码
	 * @param newPassword 新密码
	 */
	void changePassword(Integer uid, String username, String oldPassword, String newPassword);
	
	/**
	 * 修改用户资料
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户名
	 * @param user 用户的新资料，可以包含手机号码、电子邮箱、性别
	 */
	void changeInfo(Integer uid, String username, User user);
	
	/**
	 * 获取当前登录的用户资料
	 * @param uid 当前登录的用户的id
	 * @return 该用户的资料
	 */
	User getInfo(Integer uid);
	
}




