package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperarConexion() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/control_de_stock";
        String usuario = "postgres";
        String contraseña = "4658";
        
		return DriverManager.getConnection(url, usuario, contraseña);
		
	}
}
