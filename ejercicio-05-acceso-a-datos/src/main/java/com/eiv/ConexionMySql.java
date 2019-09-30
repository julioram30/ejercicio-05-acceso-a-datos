package com.eiv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConexionMySql implements Conexion {

    final HikariConfig config = new HikariConfig();

    @Override
    public Connection conectar(String url, String user, String password, String port) 
            throws SQLException {

        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl(url);
        config.setUsername(user);
        config.setPassword(password);
        HikariDataSource ds = getDataSource();
        return ds.getConnection();

    }

    @Override
    public HikariDataSource getDataSource() {
        HikariDataSource ds = new HikariDataSource(config);

        return ds;
    }

    @Override
    public void getStatus() {
        // TODO Auto-generated method stub

    }

    public PreparedStatement getStatement() throws SQLException {
        PreparedStatement stmt = null;
        return stmt;
    }

}
