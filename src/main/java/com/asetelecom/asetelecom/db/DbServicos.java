package com.asetelecom.asetelecom.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbServicos {

	public static ResultSet consultarServicos(Connection conn) {
		Statement st;
		try {
			st = conn.createStatement();
			return st.executeQuery("select * from servicos");
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	
}
