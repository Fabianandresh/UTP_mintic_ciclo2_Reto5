
package Controller;

import Reto5.model.dao.AsesorPorCiudadDao;
import Reto5.model.dao.CompraPorProveedorDao;
import Reto5.model.dao.ProyectoCasaCampestreDao;
import Reto5.model.vo.AsesorPorCiudadVo;
import Reto5.model.vo.CompraPorProveedorVo;
import Reto5.model.vo.ProyectoCasaCampestreVo;
import java.sql.SQLException;
import java.util.ArrayList;


public class RequerimientoController {
    
    private final AsesorPorCiudadDao asesorPorCiudadDao;
    private final ProyectoCasaCampestreDao proyectoCasaCampestreDao;
    private final CompraPorProveedorDao compraPorProveedorDao;

    public RequerimientoController() {
        asesorPorCiudadDao = new AsesorPorCiudadDao();
        proyectoCasaCampestreDao = new ProyectoCasaCampestreDao();
        compraPorProveedorDao = new CompraPorProveedorDao();
    }


    public ArrayList<AsesorPorCiudadVo> consultarAsesorPorCiudad() throws SQLException{
        return asesorPorCiudadDao.listar();
    }

    public ArrayList<ProyectoCasaCampestreVo> consultarProyectoCasaCampestre() throws SQLException {
        return proyectoCasaCampestreDao.listar();
    }

    public ArrayList<CompraPorProveedorVo> consultarCompraPorProveedor() throws SQLException {
        return compraPorProveedorDao.listar();
    }

}
