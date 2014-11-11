package com.gerirme.repository;

import com.codeslap.persistence.SqlAdapter;

/**
 * 
 * Classe que encapsula todo o acesso ao framework de persistecia, 
 * neste caso ela serve como um adapter do framework para nossas regras, 
 * pq caso quisermos trocar de framework de persistencia, basta alterar essa classe..
 *
 */
public class EntityManager {
	private static SqlAdapter sqlAdapter;

	public static void createEntityManager(SqlAdapter sqlAdapter) {
		EntityManager.setSqlAdapter(sqlAdapter);
	}

	public static SqlAdapter getSqlAdapter() {
		return sqlAdapter;
	}

	private static void setSqlAdapter(SqlAdapter sqlAdapter) {
		EntityManager.sqlAdapter = sqlAdapter;
	}
}
