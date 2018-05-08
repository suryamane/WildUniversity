package com.university.dao;

import java.sql.Connection;

public interface DBConnectionUtil {
	Connection getConnection();
	void closeConnection();

}
