package com.gerirme.repository;

import java.util.List;

import com.gerirme.model.User;

public class UserRepository {
	public static boolean hasLogin() {
		List<User> resul = EntityManager.getSqlAdapter().findAll(User.class);
		return resul.size() > 0;
	}
}
