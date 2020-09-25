package clases;

import java.sql.*;

public class Conexion {

    public static Connection conectar() {

        try {
            String url = "jdbc:mysql://localhost:3306/allie_prueba";
            String username = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return (null);
    }

}
