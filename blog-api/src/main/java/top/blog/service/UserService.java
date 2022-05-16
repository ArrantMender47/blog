package top.blog.service;

import top.blog.entity.User;

public interface UserService {
	User findUserByUsernameAndPassword(String username, String password);

	User findUserById(Long id);
}
