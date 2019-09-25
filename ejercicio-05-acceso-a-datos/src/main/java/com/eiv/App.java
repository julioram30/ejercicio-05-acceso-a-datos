package com.eiv;

import javax.sql.DataSource;

public class App 
{
    public static void main( String[] args )
    {
        DataSource ds;
        ConexionMySQL conn = new ConexionMySQL();
        conn.conectar("jdbc:mysql://localhost:3306/testjava","root","S1rm32nt4756","3306");
        ds= conn.getDataSource();

        
    }
}
