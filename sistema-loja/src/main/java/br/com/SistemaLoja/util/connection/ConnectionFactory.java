package br.com.SistemaLoja.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnectionMySql() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:myql://localhost:3306/?user=root";
        String login = "Admin";
        String senha = "Admin";
        return DriverManager.getConnection(url, login, senha);
    }
}
