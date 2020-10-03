package edu.umg.DAO;

import edu.umg.modelo.Carrera;
import edu.umg.utils.VariablesGlobales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase nos presenta los mecanismo para acceder a la base de datos
 * y manejar la información de la tabla carrera
 */
public class CarreraDAO {

    /**
     * Método para obtener todos los registros de la base de datos como objetos
     * @return List de Carrera
     */
    public List<Carrera> getDBCarreras(){
        List<Carrera> carreras = new ArrayList<Carrera>();
        try {
            Statement statement = VariablesGlobales.conn.createStatement();
            String consulta = " SELECT codigo, nombre"+
                              " FROM carreras";
            ResultSet rs = statement.executeQuery(consulta);
            while(rs.next()){
                carreras.add(new Carrera(rs.getInt("codigo"), rs.getString("nombre")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return carreras;
    }

    /**
     * Método sirve para persistir las carreras en la base de datos
     * @param carrera
     */
    public void saveCarrera(Carrera carrera){
        try {
            Statement statement = VariablesGlobales.conn.createStatement();
            String dml = "INSERT INTO carreras(codigo,nombre) VALUES("+
                        carrera.getCodigo() + ",'" + carrera.getNombre() + "')";
            System.out.println("dml = " + dml);
            statement.executeUpdate(dml);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
