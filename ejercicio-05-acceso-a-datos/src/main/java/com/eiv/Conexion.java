package com.eiv;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public interface Conexion {

    public Connection conectar(String url,String user, String password,String port) 
            throws SQLException;
    public HikariDataSource getDataSource();
    public void getStatus();
   
    
}
