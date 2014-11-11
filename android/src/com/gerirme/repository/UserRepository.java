package com.gerirme.repository;

import java.util.List;

import com.gerirme.model.User;

/**
 * 
 * Classe de acesso a dados do usuario esta e 
 * uma implementação do repositorio de acesso ao dados 
 * muito comun em sistemas que usam DDD
 *
 */
public class UserRepository {
	public static boolean hasLogin() {
		List<User> resul = EntityManager.getSqlAdapter().findAll(User.class);
		return resul.size() > 0;
	}
}
