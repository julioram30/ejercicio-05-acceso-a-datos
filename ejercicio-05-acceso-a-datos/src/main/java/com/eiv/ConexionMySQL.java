package com.eiv;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConexionMySQL implements Conexion {
    
    final HikariConfig config = new HikariConfig();
    
    @Override
    public void conectar(String url, String user, String password, String port) {
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl(url);
        config.setUsername(user);
        config.setPassword(password);
        
        
    }
  
    @Override
    public DataSource getDataSource() {
        HikariDataSource  ds = new HikariDataSource(config);
        
        return ds;
    }

    @Override
    public void getStatus() {
        // TODO Auto-generated method stub
        
    }

   

}
