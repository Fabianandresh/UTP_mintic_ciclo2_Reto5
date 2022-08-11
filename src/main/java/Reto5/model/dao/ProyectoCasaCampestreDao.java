
package Reto5.model.dao;

import Reto5.model.vo.ProyectoCasaCampestreVo;
import Reto5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProyectoCasaCampestreDao {
public ArrayList<ProyectoCasaCampestreVo> listar() throws SQLException {

        ArrayList<ProyectoCasaCampestreVo> resultado = new ArrayList<ProyectoCasaCampestreVo>();
        Connection conn = JDBCUtilities.gConnection();

        try{
            String sql = " SELECT p.ID_Proyecto, p.Constructora, p.Numero_Habitaciones, p.Ciudad " +
                         " FROM Proyecto p " +
                         " WHERE p.Ciudad IN('Santa Marta', 'Cartagena','Barranquilla') " +
                         " AND p.Clasificacion = 'Casa Campestre'; ";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ProyectoCasaCampestreVo casa = new ProyectoCasaCampestreVo(
                    rs.getInt("ID_Proyecto"),
                    rs.getString("Constructora"),
                    rs.getDouble("Numero_Habitaciones"),
                    rs.getString("Ciudad")
                );
                
                resultado.add(casa);
            }

            rs.close();
            stmt.close();
        } finally {
            if (conn != null){
                conn.close();
            }
        }

        return resultado;
    }
    
}   

