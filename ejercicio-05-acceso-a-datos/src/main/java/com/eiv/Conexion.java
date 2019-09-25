package com.eiv;

import javax.sql.DataSource;

public interface Conexion {

    public void conectar(String url,String user, String password,String port);
    public DataSource getDataSource();
    public void getStatus();
    
}
