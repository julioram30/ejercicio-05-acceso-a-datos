package com.eiv;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Conexion {
    
    final HikariConfig config = new HikariConfig();
    
    public void conectar() {
        
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/testjava");
        config.setUsername("root");
        config.setPassword("S1rm32nt4756");
    }
    
    public DataSource getDataSource() {
        HikariDataSource  ds = new HikariDataSource(config);
        
        return ds;
    }

}
