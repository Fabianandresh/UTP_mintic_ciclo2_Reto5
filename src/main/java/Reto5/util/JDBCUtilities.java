
package Reto5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtilities {
  private static final String UBICACION_DB = "/C:/proyectoJDBC/RETO5/ProyectosConstruccion.db/";

    public static Connection gConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);
    }
}