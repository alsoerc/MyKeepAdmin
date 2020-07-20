package datadashboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ApartadoDetalle;

/**
 *
 * @author alsorc
 */
public class DaoApartados implements IDao<ApartadoDetalle> {

    private transient Connection driverPostgres;
    private boolean successQuery = false;
    private transient PreparedStatement preQuery;
    private long key = -1L;

    public DaoApartados() {
        driverPostgres = ConnectionToDb.getInstance().getDriver();
    }

    private String consulta1 = "Select id_apartado, tipos_equipos.nombre, usuarios.nombre, usuarios.matricula, carreras.nombre, lugares.edificio, lugares.aula, apartados.grupo, fecha, hora_inicio, hora_final FROM apartados \n"
            + "INNER JOIN equipos ON apartados.id_equipo = equipos.id_equipo\n"
            + "INNER JOIN tipos_equipos ON equipos.id_tipos_equipo = tipos_equipos.id_tipos_equipo\n"
            + "INNER JOIN usuarios ON usuarios.matricula = apartados.matricula\n"
            + "INNER JOIN lugares ON lugares.id_lugar = apartados.id_lugar\n"
            + "INNER JOIN carreras ON carreras.id_carrera = usuarios.id_carrera\n"
            + "WHERE carreras.id_carrera = ?";

    private String consulta2 = "Select id_apartado, tipos_equipos.nombre, usuarios.nombre, usuarios.matricula, carreras.nombre, lugares.edificio, lugares.aula, apartados.grupo, fecha, hora_inicio, hora_final FROM apartados \n"
            + "INNER JOIN equipos ON apartados.id_equipo = equipos.id_equipo\n"
            + "INNER JOIN tipos_equipos ON equipos.id_tipos_equipo = tipos_equipos.id_tipos_equipo\n"
            + "INNER JOIN usuarios ON usuarios.matricula = apartados.matricula\n"
            + "INNER JOIN lugares ON lugares.id_lugar = apartados.id_lugar\n"
            + "INNER JOIN carreras ON carreras.id_carrera = usuarios.id_carrera\n"
            + "WHERE lugares.edificio = ?";

    private String consulta3 = "Select id_apartado, tipos_equipos.nombre, usuarios.nombre, usuarios.matricula, carreras.nombre, lugares.edificio, lugares.aula, apartados.grupo, fecha, hora_inicio, hora_final FROM apartados \n"
            + "INNER JOIN equipos ON apartados.id_equipo = equipos.id_equipo\n"
            + "INNER JOIN tipos_equipos ON equipos.id_tipos_equipo = tipos_equipos.id_tipos_equipo\n"
            + "INNER JOIN usuarios ON usuarios.matricula = apartados.matricula\n"
            + "INNER JOIN lugares ON lugares.id_lugar = apartados.id_lugar\n"
            + "INNER JOIN carreras ON carreras.id_carrera = usuarios.id_carrera\n"
            + "WHERE tipos_equipos.id_tipos_equipo = ?";

    private String consulta4 = "Select id_apartado, tipos_equipos.nombre, usuarios.nombre, usuarios.matricula, carreras.nombre, lugares.edificio, lugares.aula, apartados.grupo, fecha, hora_inicio, hora_final FROM apartados \n"
            + "INNER JOIN equipos ON apartados.id_equipo = equipos.id_equipo\n"
            + "INNER JOIN tipos_equipos ON equipos.id_tipos_equipo = tipos_equipos.id_tipos_equipo\n"
            + "INNER JOIN usuarios ON usuarios.matricula = apartados.matricula\n"
            + "INNER JOIN lugares ON lugares.id_lugar = apartados.id_lugar\n"
            + "INNER JOIN carreras ON carreras.id_carrera = usuarios.id_carrera\n"
            + "WHERE apartados.fecha= ?";

    public List<ApartadoDetalle> getRecordsFecha(java.sql.Date fecha){
        List<ApartadoDetalle> listaApartados = new ArrayList();
        try {
            preQuery = driverPostgres.prepareStatement(consulta4);
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preQuery.setDate(1, fecha);
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet data = null;
        try {
            data = preQuery.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (data.next()) {
                ApartadoDetalle apartado = new ApartadoDetalle();
                apartado.setIdApartado(data.getInt(1));
                apartado.setNombreEquipo(data.getString(2));
                apartado.setNombre(data.getString(3));
                apartado.setMatricula(data.getString(4));
                apartado.setCarrera(data.getString(5));
                apartado.setEdificio(data.getString(6));
                apartado.setAula(data.getString(7));
                apartado.setGrupo(data.getString(8));
                apartado.setFecha(data.getString(9));
                apartado.setHoraInicio(data.getString(10));
                apartado.setHoraFinal(data.getString(11));
                listaApartados.add(apartado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaApartados;
    }
    
    public int getRecordsEquiposCount(String equipo) throws SQLException {
        ResultSet data;
        int cantidad = 0;
        try {
            preQuery = driverPostgres.prepareStatement(consulta2);
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        preQuery.setString(1, equipo);
        data = preQuery.executeQuery();

        try {
            while (data.next()) {
                cantidad++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad;
    }

    public int getRecordsEdificio(String edificio) throws SQLException {
        ResultSet data;
        int cantidad = 0;
        try {
            preQuery = driverPostgres.prepareStatement(consulta2);
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        preQuery.setString(1, edificio);
        data = preQuery.executeQuery();

        try {
            while (data.next()) {
                cantidad++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad;
    }

    @Override
    public List<ApartadoDetalle> getRecords(int carrera) {
        List<ApartadoDetalle> listaApartados = new ArrayList();
        try {
            preQuery = driverPostgres.prepareStatement(consulta1);
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preQuery.setInt(1, carrera);
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet data = null;
        try {
            data = preQuery.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while (data.next()) {
                ApartadoDetalle apartado = new ApartadoDetalle();
                apartado.setIdApartado(data.getInt(1));
                apartado.setNombreEquipo(data.getString(2));
                apartado.setNombre(data.getString(3));
                apartado.setMatricula(data.getString(4));
                apartado.setCarrera(data.getString(5));
                apartado.setEdificio(data.getString(6));
                apartado.setAula(data.getString(7));
                apartado.setGrupo(data.getString(8));
                apartado.setFecha(data.getString(9));
                apartado.setHoraInicio(data.getString(10));
                apartado.setHoraFinal(data.getString(11));
                listaApartados.add(apartado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoApartados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaApartados;
    }

}
