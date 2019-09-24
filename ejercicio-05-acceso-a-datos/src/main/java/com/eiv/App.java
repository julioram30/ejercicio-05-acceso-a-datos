package com.eiv;

import javax.sql.DataSource;

public class App 
{
    public static void main( String[] args )
    {
        DataSource ds;
        Conexion conn = new Conexion();
        conn.conectar();
        ds= conn.getDataSource();
    }
}
