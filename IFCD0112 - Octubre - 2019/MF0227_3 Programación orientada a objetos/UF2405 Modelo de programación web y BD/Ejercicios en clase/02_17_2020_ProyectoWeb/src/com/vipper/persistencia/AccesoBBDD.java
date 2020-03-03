package com.vipper.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;

public class AccesoBBDD extends {
public String verificarpass(String usuario) {
	//declarar variable
	String sql = "call abogados.verificarpass('?');";
	CallableStatement st;
	ResultSet rs;
	String password;
	// abrir conexion
	abrirConexion();
	
	//obtener comando
	st = miConexion.prepareCall(sql);
	
	//
	st.setString(1, usuario);
	//ejecutar comando
	rs = st.executeQuery();
			if(rs.next()) {
				password = rs.getNString("password");
				//cerrar conex
				cerrarConexion();
				return password;
				
				  
	
}
}
}